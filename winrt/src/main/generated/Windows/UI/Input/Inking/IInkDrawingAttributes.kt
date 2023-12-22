package Windows.UI.Input.Inking

import Windows.Foundation.Size
import Windows.UI.Color
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

@ABIMarker(IInkDrawingAttributes.ABI::class)
@Signature("{97a2176c-6774-48ad-84f0-48f5a9be74f9}")
@Guid("97a2176c677448ad84f048f5a9be74f9")
@WinRTInterface("97a2176c677448ad84f048f5a9be74f9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkDrawingAttributes.ByReference::class)
public interface IInkDrawingAttributes : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Color(): Color?

  @InterfaceMethod(1)
  public fun put_Color(value: Color?): Unit

  @InterfaceMethod(2)
  public fun get_PenTip(): PenTipShape?

  @InterfaceMethod(3)
  public fun put_PenTip(value: PenTipShape?): Unit

  @InterfaceMethod(4)
  public fun get_Size(): Size?

  @InterfaceMethod(5)
  public fun put_Size(value: Size?): Unit

  @InterfaceMethod(6)
  public fun get_IgnorePressure(): Boolean

  @InterfaceMethod(7)
  public fun put_IgnorePressure(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_FitToCurve(): Boolean

  @InterfaceMethod(9)
  public fun put_FitToCurve(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkDrawingAttributes> {
    public override fun getValue() = ABI.makeIInkDrawingAttributes(pointer.getPointer(0))

    public fun setValue(value: IInkDrawingAttributes_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkDrawingAttributes {
    public val __201325929_Ptr: Pointer?

    public val _201325929_VtblPtr: Pointer?
      get() = __201325929_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Color(): Color? {
      val fnPtr = _201325929_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__201325929_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Color(value: Color?): Unit {
      val fnPtr = _201325929_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__201325929_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_PenTip(): PenTipShape? {
      val fnPtr = _201325929_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PenTipShape>()
      val hr = fn.invokeHR(arrayOf(__201325929_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PenTipShape>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_PenTip(value: PenTipShape?): Unit {
      val fnPtr = _201325929_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__201325929_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Size(): Size? {
      val fnPtr = _201325929_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__201325929_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Size(value: Size?): Unit {
      val fnPtr = _201325929_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__201325929_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IgnorePressure(): Boolean {
      val fnPtr = _201325929_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__201325929_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_IgnorePressure(value: Boolean): Unit {
      val fnPtr = _201325929_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__201325929_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_FitToCurve(): Boolean {
      val fnPtr = _201325929_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__201325929_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_FitToCurve(value: Boolean): Unit {
      val fnPtr = _201325929_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__201325929_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInkDrawingAttributes_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __201325929_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkDrawingAttributes, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("97a2176c677448ad84f048f5a9be74f9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkDrawingAttributes(ptr: Pointer?): WithDefault =
        IInkDrawingAttributes_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkDrawingAttributes {
      val address = segment.toRawLongValue()
      return makeIInkDrawingAttributes(Pointer(address))
    }

    public override fun toNative(obj: IInkDrawingAttributes): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__201325929_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkDrawingAttributes): Array<IInkDrawingAttributes?> =
        (elements as
        Array<IInkDrawingAttributes?>).castToImpl<IInkDrawingAttributes,IInkDrawingAttributes_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkDrawingAttributes?> =
        arrayOfNulls<IInkDrawingAttributes_Impl>(size) as Array<IInkDrawingAttributes?>
  }
}
