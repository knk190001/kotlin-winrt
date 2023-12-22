package Windows.UI.ViewManagement.Core

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.TimeSpan
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

@ABIMarker(ICoreInputViewAnimationStartingEventArgs.ABI::class)
@Signature("{a9144af2-b55c-5ea1-b8ab-5340f3e94897}")
@Guid("a9144af2b55c5ea1b8ab5340f3e94897")
@WinRTInterface("a9144af2b55c5ea1b8ab5340f3e94897")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreInputViewAnimationStartingEventArgs.ByReference::class)
public interface ICoreInputViewAnimationStartingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Occlusions(): IVectorView<CoreInputViewOcclusion?>?

  @InterfaceMethod(1)
  public fun get_Handled(): Boolean

  @InterfaceMethod(2)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_AnimationDuration(): TimeSpan?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreInputViewAnimationStartingEventArgs> {
    public override fun getValue() =
        ABI.makeICoreInputViewAnimationStartingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreInputViewAnimationStartingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreInputViewAnimationStartingEventArgs {
    public val __1369417712_Ptr: Pointer?

    public val _1369417712_VtblPtr: Pointer?
      get() = __1369417712_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Occlusions(): IVectorView<CoreInputViewOcclusion?>? {
      val fnPtr = _1369417712_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<CoreInputViewOcclusion?>>()
      val hr = fn.invokeHR(arrayOf(__1369417712_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<CoreInputViewOcclusion?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1369417712_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1369417712_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1369417712_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1369417712_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_AnimationDuration(): TimeSpan? {
      val fnPtr = _1369417712_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1369417712_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }
  }

  public class ICoreInputViewAnimationStartingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1369417712_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreInputViewAnimationStartingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a9144af2b55c5ea1b8ab5340f3e94897")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreInputViewAnimationStartingEventArgs(ptr: Pointer?): WithDefault =
        ICoreInputViewAnimationStartingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreInputViewAnimationStartingEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreInputViewAnimationStartingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreInputViewAnimationStartingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1369417712_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreInputViewAnimationStartingEventArgs):
        Array<ICoreInputViewAnimationStartingEventArgs?> = (elements as
        Array<ICoreInputViewAnimationStartingEventArgs?>).castToImpl<ICoreInputViewAnimationStartingEventArgs,ICoreInputViewAnimationStartingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreInputViewAnimationStartingEventArgs?> =
        arrayOfNulls<ICoreInputViewAnimationStartingEventArgs_Impl>(size) as
        Array<ICoreInputViewAnimationStartingEventArgs?>
  }
}
