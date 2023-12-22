package Windows.ApplicationModel.AppExtensions

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

@ABIMarker(IAppExtension2.ABI::class)
@Signature("{ab3b15f0-14f9-4b9f-9419-a349a242ef38}")
@Guid("ab3b15f014f94b9f9419a349a242ef38")
@WinRTInterface("ab3b15f014f94b9f9419a349a242ef38")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppExtension2.ByReference::class)
public interface IAppExtension2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AppUserModelId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAppExtension2>
      {
    public override fun getValue() = ABI.makeIAppExtension2(pointer.getPointer(0))

    public fun setValue(value: IAppExtension2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppExtension2 {
    public val __121078870_Ptr: Pointer?

    public val _121078870_VtblPtr: Pointer?
      get() = __121078870_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppUserModelId(): String? {
      val fnPtr = _121078870_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__121078870_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAppExtension2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __121078870_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppExtension2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ab3b15f014f94b9f9419a349a242ef38")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppExtension2(ptr: Pointer?): WithDefault = IAppExtension2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppExtension2 {
      val address = segment.toRawLongValue()
      return makeIAppExtension2(Pointer(address))
    }

    public override fun toNative(obj: IAppExtension2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__121078870_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppExtension2): Array<IAppExtension2?> = (elements as
        Array<IAppExtension2?>).castToImpl<IAppExtension2,IAppExtension2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppExtension2?> =
        arrayOfNulls<IAppExtension2_Impl>(size) as Array<IAppExtension2?>
  }
}
