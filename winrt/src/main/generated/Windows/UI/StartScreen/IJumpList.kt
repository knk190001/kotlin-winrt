package Windows.UI.StartScreen

import Windows.Foundation.Collections.IVector
import Windows.Foundation.IAsyncAction
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IJumpList.ABI::class)
@Signature("{b0234c3e-cd6f-4cb6-a611-61fd505f3ed1}")
@Guid("b0234c3ecd6f4cb6a61161fd505f3ed1")
@WinRTInterface("b0234c3ecd6f4cb6a61161fd505f3ed1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IJumpList.ByReference::class)
public interface IJumpList : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Items(): IVector<JumpListItem?>?

  @InterfaceMethod(1)
  public fun get_SystemGroupKind(): JumpListSystemGroupKind?

  @InterfaceMethod(2)
  public fun put_SystemGroupKind(value: JumpListSystemGroupKind?): Unit

  @InterfaceMethod(3)
  public fun SaveAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IJumpList> {
    public override fun getValue() = ABI.makeIJumpList(pointer.getPointer(0))

    public fun setValue(value: IJumpList_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IJumpList {
    public val __1780077142_Ptr: Pointer?

    public val _1780077142_VtblPtr: Pointer?
      get() = __1780077142_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Items(): IVector<JumpListItem?>? {
      val fnPtr = _1780077142_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<JumpListItem?>>()
      val hr = fn.invokeHR(arrayOf(__1780077142_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<JumpListItem?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SystemGroupKind(): JumpListSystemGroupKind? {
      val fnPtr = _1780077142_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<JumpListSystemGroupKind>()
      val hr = fn.invokeHR(arrayOf(__1780077142_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<JumpListSystemGroupKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_SystemGroupKind(value: JumpListSystemGroupKind?): Unit {
      val fnPtr = _1780077142_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1780077142_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun SaveAsync(): IAsyncAction? {
      val fnPtr = _1780077142_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1780077142_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IJumpList_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1780077142_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IJumpList, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b0234c3ecd6f4cb6a61161fd505f3ed1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIJumpList(ptr: Pointer?): WithDefault = IJumpList_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IJumpList {
      val address = segment.toRawLongValue()
      return makeIJumpList(Pointer(address))
    }

    public override fun toNative(obj: IJumpList): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1780077142_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IJumpList): Array<IJumpList?> = (elements as
        Array<IJumpList?>).castToImpl<IJumpList,IJumpList_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IJumpList?> = arrayOfNulls<IJumpList_Impl>(size)
        as Array<IJumpList?>
  }
}
