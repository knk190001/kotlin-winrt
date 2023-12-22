package Microsoft.UI.Composition

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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInsetClip.ABI::class)
@Signature("{f9d99475-7b59-5b28-a1d2-b832da6988c9}")
@Guid("f9d994757b595b28a1d2b832da6988c9")
@WinRTInterface("f9d994757b595b28a1d2b832da6988c9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInsetClip.ByReference::class)
public interface IInsetClip : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BottomInset(): Float

  @InterfaceMethod(1)
  public fun put_BottomInset(value: Float): Unit

  @InterfaceMethod(2)
  public fun get_LeftInset(): Float

  @InterfaceMethod(3)
  public fun put_LeftInset(value: Float): Unit

  @InterfaceMethod(4)
  public fun get_RightInset(): Float

  @InterfaceMethod(5)
  public fun put_RightInset(value: Float): Unit

  @InterfaceMethod(6)
  public fun get_TopInset(): Float

  @InterfaceMethod(7)
  public fun put_TopInset(value: Float): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IInsetClip> {
    public override fun getValue() = ABI.makeIInsetClip(pointer.getPointer(0))

    public fun setValue(value: IInsetClip_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInsetClip {
    public val __1465129452_Ptr: Pointer?

    public val _1465129452_VtblPtr: Pointer?
      get() = __1465129452_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BottomInset(): Float {
      val fnPtr = _1465129452_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1465129452_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_BottomInset(value: Float): Unit {
      val fnPtr = _1465129452_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1465129452_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_LeftInset(): Float {
      val fnPtr = _1465129452_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1465129452_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_LeftInset(value: Float): Unit {
      val fnPtr = _1465129452_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1465129452_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_RightInset(): Float {
      val fnPtr = _1465129452_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1465129452_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_RightInset(value: Float): Unit {
      val fnPtr = _1465129452_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1465129452_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_TopInset(): Float {
      val fnPtr = _1465129452_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1465129452_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_TopInset(value: Float): Unit {
      val fnPtr = _1465129452_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1465129452_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInsetClip_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1465129452_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInsetClip, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f9d994757b595b28a1d2b832da6988c9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInsetClip(ptr: Pointer?): WithDefault = IInsetClip_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInsetClip {
      val address = segment.toRawLongValue()
      return makeIInsetClip(Pointer(address))
    }

    public override fun toNative(obj: IInsetClip): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1465129452_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInsetClip): Array<IInsetClip?> = (elements as
        Array<IInsetClip?>).castToImpl<IInsetClip,IInsetClip_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInsetClip?> = arrayOfNulls<IInsetClip_Impl>(size)
        as Array<IInsetClip?>
  }
}
