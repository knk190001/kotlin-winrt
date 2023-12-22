package Windows.UI.StartScreen

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

@ABIMarker(IJumpListItemStatics.ABI::class)
@Signature("{f1bfc4e8-c7aa-49cb-8dde-ecfccd7ad7e4}")
@Guid("f1bfc4e8c7aa49cb8ddeecfccd7ad7e4")
@WinRTInterface("f1bfc4e8c7aa49cb8ddeecfccd7ad7e4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IJumpListItemStatics.ByReference::class)
public interface IJumpListItemStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWithArguments(arguments: String?, displayName: String?): JumpListItem?

  @InterfaceMethod(1)
  public fun CreateSeparator(): JumpListItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IJumpListItemStatics> {
    public override fun getValue() = ABI.makeIJumpListItemStatics(pointer.getPointer(0))

    public fun setValue(value: IJumpListItemStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IJumpListItemStatics {
    public val __1642121988_Ptr: Pointer?

    public val _1642121988_VtblPtr: Pointer?
      get() = __1642121988_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWithArguments(arguments: String?, displayName: String?):
        JumpListItem? {
      val fnPtr = _1642121988_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<JumpListItem>()
      val hr = fn.invokeHR(arrayOf(__1642121988_Ptr, marshalToNative(arguments),
          marshalToNative(displayName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<JumpListItem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateSeparator(): JumpListItem? {
      val fnPtr = _1642121988_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<JumpListItem>()
      val hr = fn.invokeHR(arrayOf(__1642121988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<JumpListItem>(result.getValue())
      return resultValue
    }
  }

  public class IJumpListItemStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1642121988_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IJumpListItemStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f1bfc4e8c7aa49cb8ddeecfccd7ad7e4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIJumpListItemStatics(ptr: Pointer?): WithDefault = IJumpListItemStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IJumpListItemStatics {
      val address = segment.toRawLongValue()
      return makeIJumpListItemStatics(Pointer(address))
    }

    public override fun toNative(obj: IJumpListItemStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1642121988_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IJumpListItemStatics): Array<IJumpListItemStatics?> =
        (elements as
        Array<IJumpListItemStatics?>).castToImpl<IJumpListItemStatics,IJumpListItemStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IJumpListItemStatics?> =
        arrayOfNulls<IJumpListItemStatics_Impl>(size) as Array<IJumpListItemStatics?>
  }
}
