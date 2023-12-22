package Windows.Graphics.Imaging

import Windows.Foundation.PropertyType
import Windows.Graphics.Imaging.IBitmapTypedValueFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(BitmapTypedValue.ABI::class)
@Signature("rc(Windows.Graphics.Imaging.BitmapTypedValue;{cd8044a9-2443-4000-b0cd-79316c56f589})")
@WinRTByReference(brClass = BitmapTypedValue.ByReference::class)
public class BitmapTypedValue(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBitmapTypedValue.WithDefault, IWinRTObject {
  private val __492602113_Interface: IBitmapTypedValue.WithDefault by lazy {
    as_492602113()
  }


  public override val __492602113_Ptr: JNAPointer? by lazy {
    __492602113_Interface.__492602113_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__492602113_Interface)

  public constructor(value: IUnknown, type: PropertyType) : this(ABI.activate(value, type))

  private fun as_492602113(): IBitmapTypedValue.WithDefault {
    if(pointer == NULL) {
      return(IBitmapTypedValue.ABI.makeIBitmapTypedValue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBitmapTypedValue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBitmapTypedValue.ABI.makeIBitmapTypedValue(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BitmapTypedValue> {
    public override fun getValue() = BitmapTypedValue(pointer.getPointer(0))

    public fun setValue(value: BitmapTypedValue): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BitmapTypedValue, MemoryAddress> {
    public val IBitmapTypedValueFactory_Instance: IBitmapTypedValueFactory by lazy {
      createIBitmapTypedValueFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBitmapTypedValueFactory(): IBitmapTypedValueFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Imaging.BitmapTypedValue".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IBitmapTypedValueFactory.ABI.makeIBitmapTypedValueFactory(factoryActivatorPtr.value))
    }

    public fun activate(value: IUnknown, type: PropertyType): JNAPointer? =
        IBitmapTypedValueFactory_Instance.Create(value, type)?.pointer

    public override fun fromNative(segment: MemoryAddress): BitmapTypedValue {
      val address = segment.toRawLongValue()
      return BitmapTypedValue(Pointer(address))
    }

    public override fun toNative(obj: BitmapTypedValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
