package Windows.UI.Input.Inking

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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInkPoint2.ABI::class)
@Signature("{fba9c3f7-ae56-4d5c-bd2f-0ac45f5e4af9}")
@Guid("fba9c3f7ae564d5cbd2f0ac45f5e4af9")
@WinRTInterface("fba9c3f7ae564d5cbd2f0ac45f5e4af9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkPoint2.ByReference::class)
public interface IInkPoint2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TiltX(): Float

  @InterfaceMethod(1)
  public fun get_TiltY(): Float

  @InterfaceMethod(2)
  public fun get_Timestamp(): WinDef.ULONG

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IInkPoint2> {
    public override fun getValue() = ABI.makeIInkPoint2(pointer.getPointer(0))

    public fun setValue(value: IInkPoint2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkPoint2 {
    public val __794007502_Ptr: Pointer?

    public val _794007502_VtblPtr: Pointer?
      get() = __794007502_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TiltX(): Float {
      val fnPtr = _794007502_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__794007502_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_TiltY(): Float {
      val fnPtr = _794007502_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__794007502_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Timestamp(): WinDef.ULONG {
      val fnPtr = _794007502_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__794007502_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }
  }

  public class IInkPoint2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __794007502_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkPoint2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fba9c3f7ae564d5cbd2f0ac45f5e4af9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkPoint2(ptr: Pointer?): WithDefault = IInkPoint2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkPoint2 {
      val address = segment.toRawLongValue()
      return makeIInkPoint2(Pointer(address))
    }

    public override fun toNative(obj: IInkPoint2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__794007502_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkPoint2): Array<IInkPoint2?> = (elements as
        Array<IInkPoint2?>).castToImpl<IInkPoint2,IInkPoint2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkPoint2?> = arrayOfNulls<IInkPoint2_Impl>(size)
        as Array<IInkPoint2?>
  }
}
