package Windows.ApplicationModel.Core

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

@ABIMarker(IAppListEntry2.ABI::class)
@Signature("{d0a618ad-bf35-42ac-ac06-86eeeb41d04b}")
@Guid("d0a618adbf3542acac0686eeeb41d04b")
@WinRTInterface("d0a618adbf3542acac0686eeeb41d04b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppListEntry2.ByReference::class)
public interface IAppListEntry2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AppUserModelId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAppListEntry2>
      {
    public override fun getValue() = ABI.makeIAppListEntry2(pointer.getPointer(0))

    public fun setValue(value: IAppListEntry2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppListEntry2 {
    public val __40853279_Ptr: Pointer?

    public val _40853279_VtblPtr: Pointer?
      get() = __40853279_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppUserModelId(): String? {
      val fnPtr = _40853279_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__40853279_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAppListEntry2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __40853279_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppListEntry2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d0a618adbf3542acac0686eeeb41d04b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppListEntry2(ptr: Pointer?): WithDefault = IAppListEntry2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppListEntry2 {
      val address = segment.toRawLongValue()
      return makeIAppListEntry2(Pointer(address))
    }

    public override fun toNative(obj: IAppListEntry2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__40853279_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppListEntry2): Array<IAppListEntry2?> = (elements as
        Array<IAppListEntry2?>).castToImpl<IAppListEntry2,IAppListEntry2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppListEntry2?> =
        arrayOfNulls<IAppListEntry2_Impl>(size) as Array<IAppListEntry2?>
  }
}
