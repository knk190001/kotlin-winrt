package Windows.UI.Xaml.Media.Imaging

import Windows.UI.Xaml.Media.Imaging.IWriteableBitmapFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(WriteableBitmap.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Imaging.WriteableBitmap;{bf0b7e6f-df7c-4a85-8413-a1216285835c})")
@WinRTByReference(brClass = WriteableBitmap.ByReference::class)
public class WriteableBitmap(
  ptr: JNAPointer? = NULL
) : BitmapSource(ptr), IWriteableBitmap.WithDefault, IWinRTObject {
  private val __2015929066_Interface: IWriteableBitmap.WithDefault by lazy {
    as_2015929066()
  }


  public override val __2015929066_Ptr: JNAPointer? by lazy {
    __2015929066_Interface.__2015929066_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2015929066_Interface)

  public constructor(pixelWidth: Int, pixelHeight: Int) : this(ABI.activate(pixelWidth,
      pixelHeight))

  private fun as_2015929066(): IWriteableBitmap.WithDefault {
    if(pointer == NULL) {
      return(IWriteableBitmap.ABI.makeIWriteableBitmap(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWriteableBitmap>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWriteableBitmap.ABI.makeIWriteableBitmap(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WriteableBitmap> {
    public override fun getValue() = WriteableBitmap(pointer.getPointer(0))

    public fun setValue(value: WriteableBitmap): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WriteableBitmap, MemoryAddress> {
    public val IWriteableBitmapFactory_Instance: IWriteableBitmapFactory by lazy {
      createIWriteableBitmapFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWriteableBitmapFactory(): IWriteableBitmapFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Imaging.WriteableBitmap".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IWriteableBitmapFactory.ABI.makeIWriteableBitmapFactory(factoryActivatorPtr.value))
    }

    public fun activate(pixelWidth: Int, pixelHeight: Int): JNAPointer? =
        IWriteableBitmapFactory_Instance.CreateInstanceWithDimensions(pixelWidth,
        pixelHeight)?.pointer

    public override fun fromNative(segment: MemoryAddress): WriteableBitmap {
      val address = segment.toRawLongValue()
      return WriteableBitmap(Pointer(address))
    }

    public override fun toNative(obj: WriteableBitmap): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
