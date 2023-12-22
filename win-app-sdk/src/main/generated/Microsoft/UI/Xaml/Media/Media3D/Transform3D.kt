package Microsoft.UI.Xaml.Media.Media3D

import Microsoft.UI.Xaml.DependencyObject
import Microsoft.UI.Xaml.Media.Media3D.ITransform3DFactory.ABI.IID
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(Transform3D.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Media3D.Transform3D;{afea4941-2e49-533c-9f8f-2c126ef9893a})")
@WinRTByReference(brClass = Transform3D.ByReference::class)
public open class Transform3D(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), ITransform3D.WithDefault, IWinRTObject {
  private val __2002731219_Interface: ITransform3D.WithDefault by lazy {
    as_2002731219()
  }


  public override val __2002731219_Ptr: JNAPointer? by lazy {
    __2002731219_Interface.__2002731219_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2002731219_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2002731219(): ITransform3D.WithDefault {
    if(pointer == NULL) {
      return(ITransform3D.ABI.makeITransform3D(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITransform3D>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITransform3D.ABI.makeITransform3D(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Transform3D> {
    public override fun getValue() = Transform3D(pointer.getPointer(0))

    public fun setValue(value: Transform3D): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Transform3D, MemoryAddress> {
    public val ITransform3DFactory_Instance: ITransform3DFactory by lazy {
      createITransform3DFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITransform3DFactory(): ITransform3DFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Media3D.Transform3D".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITransform3DFactory.ABI.makeITransform3DFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ITransform3DFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): Transform3D {
      val address = segment.toRawLongValue()
      return Transform3D(Pointer(address))
    }

    public override fun toNative(obj: Transform3D): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
