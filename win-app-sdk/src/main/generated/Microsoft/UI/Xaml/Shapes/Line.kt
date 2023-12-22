package Microsoft.UI.Xaml.Shapes

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

@ABIMarker(Line.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Shapes.Line;{507b3858-af7e-559b-a87e-4cc6a5d8ba96})")
@WinRTByReference(brClass = Line.ByReference::class)
public class Line(
  ptr: JNAPointer? = NULL
) : Shape(ptr), ILine.WithDefault, IWinRTObject {
  private val __855256703_Interface: ILine.WithDefault by lazy {
    as_855256703()
  }


  public override val __855256703_Ptr: JNAPointer? by lazy {
    __855256703_Interface.__855256703_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__855256703_Interface)

  public constructor() : this(ABI.activate())

  private fun as_855256703(): ILine.WithDefault {
    if(pointer == NULL) {
      return(ILine.ABI.makeILine(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILine>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILine.ABI.makeILine(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Line> {
    public override fun getValue() = Line(pointer.getPointer(0))

    public fun setValue(value: Line): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Line, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ILineStatics_Instance: ILineStatics by lazy {
      createILineStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Shapes.Line".toHandle(), refiid,
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

    public fun createILineStatics(): ILineStatics {
      val refiid = Guid.REFIID(ILineStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Shapes.Line".toHandle(),refiid,interfacePtr)
      val result = ILineStatics.ABI.makeILineStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Line {
      val address = segment.toRawLongValue()
      return Line(Pointer(address))
    }

    public override fun toNative(obj: Line): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_X1Property() = ABI.ILineStatics_Instance.get_X1Property()

    public fun get_Y1Property() = ABI.ILineStatics_Instance.get_Y1Property()

    public fun get_X2Property() = ABI.ILineStatics_Instance.get_X2Property()

    public fun get_Y2Property() = ABI.ILineStatics_Instance.get_Y2Property()
  }
}
