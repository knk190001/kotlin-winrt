package Windows.ApplicationModel.UserDataAccounts.Provider

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IUserDataAccountPartnerAccountInfo.ABI::class)
@Signature("{5f200037-f6ef-4ec3-8630-012c59c1149f}")
@Guid("5f200037f6ef4ec38630012c59c1149f")
@WinRTInterface("5f200037f6ef4ec38630012c59c1149f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataAccountPartnerAccountInfo.ByReference::class)
public interface IUserDataAccountPartnerAccountInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DisplayName(): String?

  @InterfaceMethod(1)
  public fun get_Priority(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_AccountKind(): UserDataAccountProviderPartnerAccountKind?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataAccountPartnerAccountInfo> {
    public override fun getValue() =
        ABI.makeIUserDataAccountPartnerAccountInfo(pointer.getPointer(0))

    public fun setValue(value: IUserDataAccountPartnerAccountInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataAccountPartnerAccountInfo {
    public val __176958780_Ptr: Pointer?

    public val _176958780_VtblPtr: Pointer?
      get() = __176958780_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisplayName(): String? {
      val fnPtr = _176958780_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__176958780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Priority(): WinDef.UINT {
      val fnPtr = _176958780_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__176958780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_AccountKind(): UserDataAccountProviderPartnerAccountKind? {
      val fnPtr = _176958780_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataAccountProviderPartnerAccountKind>()
      val hr = fn.invokeHR(arrayOf(__176958780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<UserDataAccountProviderPartnerAccountKind>(result.getValue())
      return resultValue
    }
  }

  public class IUserDataAccountPartnerAccountInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __176958780_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataAccountPartnerAccountInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5f200037f6ef4ec38630012c59c1149f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataAccountPartnerAccountInfo(ptr: Pointer?): WithDefault =
        IUserDataAccountPartnerAccountInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserDataAccountPartnerAccountInfo {
      val address = segment.toRawLongValue()
      return makeIUserDataAccountPartnerAccountInfo(Pointer(address))
    }

    public override fun toNative(obj: IUserDataAccountPartnerAccountInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__176958780_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataAccountPartnerAccountInfo):
        Array<IUserDataAccountPartnerAccountInfo?> = (elements as
        Array<IUserDataAccountPartnerAccountInfo?>).castToImpl<IUserDataAccountPartnerAccountInfo,IUserDataAccountPartnerAccountInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataAccountPartnerAccountInfo?> =
        arrayOfNulls<IUserDataAccountPartnerAccountInfo_Impl>(size) as
        Array<IUserDataAccountPartnerAccountInfo?>
  }
}
