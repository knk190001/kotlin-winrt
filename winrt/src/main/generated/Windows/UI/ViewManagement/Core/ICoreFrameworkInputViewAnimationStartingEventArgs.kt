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

@ABIMarker(ICoreFrameworkInputViewAnimationStartingEventArgs.ABI::class)
@Signature("{c0ec901c-bba4-501b-ae8b-65c9e756a719}")
@Guid("c0ec901cbba4501bae8b65c9e756a719")
@WinRTInterface("c0ec901cbba4501bae8b65c9e756a719")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreFrameworkInputViewAnimationStartingEventArgs.ByReference::class)
public interface ICoreFrameworkInputViewAnimationStartingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Occlusions(): IVectorView<CoreInputViewOcclusion?>?

  @InterfaceMethod(1)
  public fun get_FrameworkAnimationRecommended(): Boolean

  @InterfaceMethod(2)
  public fun get_AnimationDuration(): TimeSpan?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreFrameworkInputViewAnimationStartingEventArgs> {
    public override fun getValue() =
        ABI.makeICoreFrameworkInputViewAnimationStartingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreFrameworkInputViewAnimationStartingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreFrameworkInputViewAnimationStartingEventArgs {
    public val __1866160374_Ptr: Pointer?

    public val _1866160374_VtblPtr: Pointer?
      get() = __1866160374_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Occlusions(): IVectorView<CoreInputViewOcclusion?>? {
      val fnPtr = _1866160374_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<CoreInputViewOcclusion?>>()
      val hr = fn.invokeHR(arrayOf(__1866160374_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<CoreInputViewOcclusion?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_FrameworkAnimationRecommended(): Boolean {
      val fnPtr = _1866160374_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1866160374_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_AnimationDuration(): TimeSpan? {
      val fnPtr = _1866160374_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1866160374_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }
  }

  public class ICoreFrameworkInputViewAnimationStartingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1866160374_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreFrameworkInputViewAnimationStartingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c0ec901cbba4501bae8b65c9e756a719")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreFrameworkInputViewAnimationStartingEventArgs(ptr: Pointer?): WithDefault =
        ICoreFrameworkInputViewAnimationStartingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreFrameworkInputViewAnimationStartingEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreFrameworkInputViewAnimationStartingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreFrameworkInputViewAnimationStartingEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1866160374_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreFrameworkInputViewAnimationStartingEventArgs):
        Array<ICoreFrameworkInputViewAnimationStartingEventArgs?> = (elements as
        Array<ICoreFrameworkInputViewAnimationStartingEventArgs?>).castToImpl<ICoreFrameworkInputViewAnimationStartingEventArgs,ICoreFrameworkInputViewAnimationStartingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<ICoreFrameworkInputViewAnimationStartingEventArgs?> =
        arrayOfNulls<ICoreFrameworkInputViewAnimationStartingEventArgs_Impl>(size) as
        Array<ICoreFrameworkInputViewAnimationStartingEventArgs?>
  }
}
