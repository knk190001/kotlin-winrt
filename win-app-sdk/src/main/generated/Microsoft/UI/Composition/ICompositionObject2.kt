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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICompositionObject2.ABI::class)
@Signature("{bcbbfebf-799c-51ce-9c82-b6e49e7e62e1}")
@Guid("bcbbfebf799c51ce9c82b6e49e7e62e1")
@WinRTInterface("bcbbfebf799c51ce9c82b6e49e7e62e1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionObject2.ByReference::class)
public interface ICompositionObject2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Comment(): String?

  @InterfaceMethod(1)
  public fun put_Comment(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_ImplicitAnimations(): ImplicitAnimationCollection?

  @InterfaceMethod(3)
  public fun put_ImplicitAnimations(value: ImplicitAnimationCollection?): Unit

  @InterfaceMethod(4)
  public fun StartAnimationGroup(value: ICompositionAnimationBase?): Unit

  @InterfaceMethod(5)
  public fun StopAnimationGroup(value: ICompositionAnimationBase?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionObject2> {
    public override fun getValue() = ABI.makeICompositionObject2(pointer.getPointer(0))

    public fun setValue(value: ICompositionObject2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionObject2 {
    public val __503796642_Ptr: Pointer?

    public val _503796642_VtblPtr: Pointer?
      get() = __503796642_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Comment(): String? {
      val fnPtr = _503796642_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__503796642_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Comment(value: String?): Unit {
      val fnPtr = _503796642_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__503796642_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ImplicitAnimations(): ImplicitAnimationCollection? {
      val fnPtr = _503796642_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImplicitAnimationCollection>()
      val hr = fn.invokeHR(arrayOf(__503796642_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImplicitAnimationCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ImplicitAnimations(value: ImplicitAnimationCollection?): Unit {
      val fnPtr = _503796642_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__503796642_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun StartAnimationGroup(value: ICompositionAnimationBase?): Unit {
      val fnPtr = _503796642_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__503796642_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun StopAnimationGroup(value: ICompositionAnimationBase?): Unit {
      val fnPtr = _503796642_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__503796642_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionObject2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __503796642_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionObject2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bcbbfebf799c51ce9c82b6e49e7e62e1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionObject2(ptr: Pointer?): WithDefault = ICompositionObject2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionObject2 {
      val address = segment.toRawLongValue()
      return makeICompositionObject2(Pointer(address))
    }

    public override fun toNative(obj: ICompositionObject2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__503796642_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionObject2): Array<ICompositionObject2?> =
        (elements as
        Array<ICompositionObject2?>).castToImpl<ICompositionObject2,ICompositionObject2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionObject2?> =
        arrayOfNulls<ICompositionObject2_Impl>(size) as Array<ICompositionObject2?>
  }
}
