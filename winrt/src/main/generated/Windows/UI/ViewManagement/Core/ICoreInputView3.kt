package Windows.UI.ViewManagement.Core

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

@ABIMarker(ICoreInputView3.ABI::class)
@Signature("{bc941653-3ab9-4849-8f58-46e7f0353cfc}")
@Guid("bc9416533ab948498f5846e7f0353cfc")
@WinRTInterface("bc9416533ab948498f5846e7f0353cfc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreInputView3.ByReference::class)
public interface ICoreInputView3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryShow(): Boolean

  @InterfaceMethod(1)
  public fun TryShow(type: CoreInputViewKind?): Boolean

  @InterfaceMethod(2)
  public fun TryHide(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreInputView3> {
    public override fun getValue() = ABI.makeICoreInputView3(pointer.getPointer(0))

    public fun setValue(value: ICoreInputView3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreInputView3 {
    public val __1575919402_Ptr: Pointer?

    public val _1575919402_VtblPtr: Pointer?
      get() = __1575919402_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryShow(): Boolean {
      val fnPtr = _1575919402_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1575919402_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun TryShow(type: CoreInputViewKind?): Boolean {
      val fnPtr = _1575919402_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1575919402_Ptr, marshalToNative(type), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun TryHide(): Boolean {
      val fnPtr = _1575919402_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1575919402_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ICoreInputView3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1575919402_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreInputView3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bc9416533ab948498f5846e7f0353cfc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreInputView3(ptr: Pointer?): WithDefault = ICoreInputView3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreInputView3 {
      val address = segment.toRawLongValue()
      return makeICoreInputView3(Pointer(address))
    }

    public override fun toNative(obj: ICoreInputView3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1575919402_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreInputView3): Array<ICoreInputView3?> = (elements as
        Array<ICoreInputView3?>).castToImpl<ICoreInputView3,ICoreInputView3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreInputView3?> =
        arrayOfNulls<ICoreInputView3_Impl>(size) as Array<ICoreInputView3?>
  }
}
