package Windows.UI.StartScreen

import Windows.Foundation.Uri
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IJumpListItem.ABI::class)
@Signature("{7adb6717-8b5d-4820-995b-9b418dbe48b0}")
@Guid("7adb67178b5d4820995b9b418dbe48b0")
@WinRTInterface("7adb67178b5d4820995b9b418dbe48b0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IJumpListItem.ByReference::class)
public interface IJumpListItem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Kind(): JumpListItemKind?

  @InterfaceMethod(1)
  public fun get_Arguments(): String?

  @InterfaceMethod(2)
  public fun get_RemovedByUser(): Boolean

  @InterfaceMethod(3)
  public fun get_Description(): String?

  @InterfaceMethod(4)
  public fun put_Description(value: String?): Unit

  @InterfaceMethod(5)
  public fun get_DisplayName(): String?

  @InterfaceMethod(6)
  public fun put_DisplayName(value: String?): Unit

  @InterfaceMethod(7)
  public fun get_GroupName(): String?

  @InterfaceMethod(8)
  public fun put_GroupName(value: String?): Unit

  @InterfaceMethod(9)
  public fun get_Logo(): Uri?

  @InterfaceMethod(10)
  public fun put_Logo(value: Uri?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IJumpListItem>
      {
    public override fun getValue() = ABI.makeIJumpListItem(pointer.getPointer(0))

    public fun setValue(value: IJumpListItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IJumpListItem {
    public val __1237296777_Ptr: Pointer?

    public val _1237296777_VtblPtr: Pointer?
      get() = __1237296777_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Kind(): JumpListItemKind? {
      val fnPtr = _1237296777_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<JumpListItemKind>()
      val hr = fn.invokeHR(arrayOf(__1237296777_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<JumpListItemKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Arguments(): String? {
      val fnPtr = _1237296777_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1237296777_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_RemovedByUser(): Boolean {
      val fnPtr = _1237296777_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1237296777_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Description(): String? {
      val fnPtr = _1237296777_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1237296777_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_Description(value: String?): Unit {
      val fnPtr = _1237296777_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1237296777_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_DisplayName(): String? {
      val fnPtr = _1237296777_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1237296777_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_DisplayName(value: String?): Unit {
      val fnPtr = _1237296777_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1237296777_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_GroupName(): String? {
      val fnPtr = _1237296777_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1237296777_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_GroupName(value: String?): Unit {
      val fnPtr = _1237296777_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1237296777_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_Logo(): Uri? {
      val fnPtr = _1237296777_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1237296777_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_Logo(value: Uri?): Unit {
      val fnPtr = _1237296777_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1237296777_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IJumpListItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1237296777_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IJumpListItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7adb67178b5d4820995b9b418dbe48b0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIJumpListItem(ptr: Pointer?): WithDefault = IJumpListItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IJumpListItem {
      val address = segment.toRawLongValue()
      return makeIJumpListItem(Pointer(address))
    }

    public override fun toNative(obj: IJumpListItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1237296777_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IJumpListItem): Array<IJumpListItem?> = (elements as
        Array<IJumpListItem?>).castToImpl<IJumpListItem,IJumpListItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IJumpListItem?> =
        arrayOfNulls<IJumpListItem_Impl>(size) as Array<IJumpListItem?>
  }
}
