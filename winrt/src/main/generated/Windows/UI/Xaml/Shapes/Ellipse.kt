package Windows.UI.Xaml.Shapes

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(Ellipse.ABI::class)
@Signature("rc(Windows.UI.Xaml.Shapes.Ellipse;{70e05ac4-d38d-4bab-831f-4a22ef52ac86})")
@WinRTByReference(brClass = Ellipse.ByReference::class)
public class Ellipse(
  ptr: JNAPointer? = NULL
) : Shape(ptr), IEllipse.WithDefault, IWinRTObject {
  private val __1398877246_Interface: IEllipse.WithDefault by lazy {
    as_1398877246()
  }


  public override val __1398877246_Ptr: JNAPointer? by lazy {
    __1398877246_Interface.__1398877246_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1398877246_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1398877246(): IEllipse.WithDefault {
    if(pointer == NULL) {
      return(IEllipse.ABI.makeIEllipse(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEllipse>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEllipse.ABI.makeIEllipse(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Ellipse> {
    public override fun getValue() = Ellipse(pointer.getPointer(0))

    public fun setValue(value: Ellipse): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Ellipse, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Shapes.Ellipse".toHandle(), refiid,
          iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): Ellipse {
      val address = segment.toRawLongValue()
      return Ellipse(Pointer(address))
    }

    public override fun toNative(obj: Ellipse): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
