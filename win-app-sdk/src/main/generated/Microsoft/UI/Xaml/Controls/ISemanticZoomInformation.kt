package Microsoft.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISemanticZoomInformation.ABI::class)
@Signature("{12d62b04-bb13-50f2-9d8b-e57c02b4bde4}")
@Guid("12d62b04bb1350f29d8be57c02b4bde4")
@WinRTInterface("12d62b04bb1350f29d8be57c02b4bde4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISemanticZoomInformation.ByReference::class)
public interface ISemanticZoomInformation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SemanticZoomOwner(): SemanticZoom?

  @InterfaceMethod(1)
  public fun put_SemanticZoomOwner(value: SemanticZoom?): Unit

  @InterfaceMethod(2)
  public fun get_IsActiveView(): Boolean

  @InterfaceMethod(3)
  public fun put_IsActiveView(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_IsZoomedInView(): Boolean

  @InterfaceMethod(5)
  public fun put_IsZoomedInView(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun InitializeViewChange(): Unit

  @InterfaceMethod(7)
  public fun CompleteViewChange(): Unit

  @InterfaceMethod(8)
  public fun MakeVisible(item: SemanticZoomLocation?): Unit

  @InterfaceMethod(9)
  public fun StartViewChangeFrom(source: SemanticZoomLocation?, destination: SemanticZoomLocation?):
      Unit

  @InterfaceMethod(10)
  public fun StartViewChangeTo(source: SemanticZoomLocation?, destination: SemanticZoomLocation?):
      Unit

  @InterfaceMethod(11)
  public fun CompleteViewChangeFrom(source: SemanticZoomLocation?,
      destination: SemanticZoomLocation?): Unit

  @InterfaceMethod(12)
  public fun CompleteViewChangeTo(source: SemanticZoomLocation?,
      destination: SemanticZoomLocation?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISemanticZoomInformation> {
    public override fun getValue() = ABI.makeISemanticZoomInformation(pointer.getPointer(0))

    public fun setValue(value: ISemanticZoomInformation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISemanticZoomInformation {
    public val __685461260_Ptr: Pointer?

    public val _685461260_VtblPtr: Pointer?
      get() = __685461260_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SemanticZoomOwner(): SemanticZoom? {
      val fnPtr = _685461260_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SemanticZoom>()
      val hr = fn.invokeHR(arrayOf(__685461260_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SemanticZoom>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_SemanticZoomOwner(value: SemanticZoom?): Unit {
      val fnPtr = _685461260_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__685461260_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsActiveView(): Boolean {
      val fnPtr = _685461260_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__685461260_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsActiveView(value: Boolean): Unit {
      val fnPtr = _685461260_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__685461260_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsZoomedInView(): Boolean {
      val fnPtr = _685461260_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__685461260_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsZoomedInView(value: Boolean): Unit {
      val fnPtr = _685461260_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__685461260_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun InitializeViewChange(): Unit {
      val fnPtr = _685461260_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__685461260_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun CompleteViewChange(): Unit {
      val fnPtr = _685461260_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__685461260_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun MakeVisible(item: SemanticZoomLocation?): Unit {
      val fnPtr = _685461260_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__685461260_Ptr, marshalToNative(item),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun StartViewChangeFrom(source: SemanticZoomLocation?,
        destination: SemanticZoomLocation?): Unit {
      val fnPtr = _685461260_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__685461260_Ptr, marshalToNative(source),
          marshalToNative(destination),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun StartViewChangeTo(source: SemanticZoomLocation?,
        destination: SemanticZoomLocation?): Unit {
      val fnPtr = _685461260_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__685461260_Ptr, marshalToNative(source),
          marshalToNative(destination),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun CompleteViewChangeFrom(source: SemanticZoomLocation?,
        destination: SemanticZoomLocation?): Unit {
      val fnPtr = _685461260_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__685461260_Ptr, marshalToNative(source),
          marshalToNative(destination),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun CompleteViewChangeTo(source: SemanticZoomLocation?,
        destination: SemanticZoomLocation?): Unit {
      val fnPtr = _685461260_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__685461260_Ptr, marshalToNative(source),
          marshalToNative(destination),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISemanticZoomInformation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __685461260_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISemanticZoomInformation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("12d62b04bb1350f29d8be57c02b4bde4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISemanticZoomInformation(ptr: Pointer?): WithDefault =
        ISemanticZoomInformation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISemanticZoomInformation {
      val address = segment.toRawLongValue()
      return makeISemanticZoomInformation(Pointer(address))
    }

    public override fun toNative(obj: ISemanticZoomInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__685461260_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISemanticZoomInformation):
        Array<ISemanticZoomInformation?> = (elements as
        Array<ISemanticZoomInformation?>).castToImpl<ISemanticZoomInformation,ISemanticZoomInformation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISemanticZoomInformation?> =
        arrayOfNulls<ISemanticZoomInformation_Impl>(size) as Array<ISemanticZoomInformation?>
  }
}
