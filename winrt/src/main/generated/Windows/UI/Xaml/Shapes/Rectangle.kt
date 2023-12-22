package Windows.UI.Xaml.Shapes

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(Rectangle.ABI::class)
@Signature("rc(Windows.UI.Xaml.Shapes.Rectangle;{855bc230-8a11-4e18-a136-4bc21c7827b0})")
@WinRTByReference(brClass = Rectangle.ByReference::class)
public class Rectangle(
  ptr: JNAPointer? = NULL
) : Shape(ptr), IRectangle.WithDefault, IWinRTObject {
  private val __437246513_Interface: IRectangle.WithDefault by lazy {
    as_437246513()
  }


  public override val __437246513_Ptr: JNAPointer? by lazy {
    __437246513_Interface.__437246513_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__437246513_Interface)

  public constructor() : this(ABI.activate())

  private fun as_437246513(): IRectangle.WithDefault {
    if(pointer == NULL) {
      return(IRectangle.ABI.makeIRectangle(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRectangle>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRectangle.ABI.makeIRectangle(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Rectangle> {
    public override fun getValue() = Rectangle(pointer.getPointer(0))

    public fun setValue(value: Rectangle): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Rectangle, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IRectangleStatics_Instance: IRectangleStatics by lazy {
      createIRectangleStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Shapes.Rectangle".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIRectangleStatics(): IRectangleStatics {
      val refiid = Guid.REFIID(IRectangleStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Shapes.Rectangle".toHandle(),refiid,interfacePtr)
      val result = IRectangleStatics.ABI.makeIRectangleStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Rectangle {
      val address = segment.toRawLongValue()
      return Rectangle(Pointer(address))
    }

    public override fun toNative(obj: Rectangle): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_RadiusXProperty() = ABI.IRectangleStatics_Instance.get_RadiusXProperty()

    public fun get_RadiusYProperty() = ABI.IRectangleStatics_Instance.get_RadiusYProperty()
  }
}
