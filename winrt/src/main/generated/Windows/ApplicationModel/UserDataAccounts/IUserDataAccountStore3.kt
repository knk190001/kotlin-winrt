package Windows.ApplicationModel.UserDataAccounts

import Windows.ApplicationModel.UserDataAccounts.IUserDataAccountStore.ABI.IID
import Windows.Foundation.IAsyncOperation
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IUserDataAccountStore3.ABI::class)
@Signature("{8142c094-f3c9-478b-b117-6585bebb6789}")
@Guid("8142c094f3c9478bb1176585bebb6789")
@WinRTInterface("8142c094f3c9478bb1176585bebb6789")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataAccountStore3.ByReference::class)
public interface IUserDataAccountStore3 : NativeMapped, IWinRTInterface, IUserDataAccountStore {
  @InterfaceMethod(0)
  public fun CreateAccountAsync(
    userDisplayName: String?,
    packageRelativeAppId: String?,
    enterpriseId: String?
  ): IAsyncOperation<UserDataAccount?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataAccountStore3> {
    public override fun getValue() = ABI.makeIUserDataAccountStore3(pointer.getPointer(0))

    public fun setValue(value: IUserDataAccountStore3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataAccountStore3, IUserDataAccountStore.WithDefault {
    public val __2019045562_Ptr: Pointer?

    public val _2019045562_VtblPtr: Pointer?
      get() = __2019045562_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateAccountAsync(
      userDisplayName: String?,
      packageRelativeAppId: String?,
      enterpriseId: String?
    ): IAsyncOperation<UserDataAccount?>? {
      val fnPtr = _2019045562_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<UserDataAccount?>>()
      val hr = fn.invokeHR(arrayOf(__2019045562_Ptr, marshalToNative(userDisplayName),
          marshalToNative(packageRelativeAppId), marshalToNative(enterpriseId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<UserDataAccount?>>(result.getValue())
      return resultValue
    }
  }

  public class IUserDataAccountStore3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IUserDataAccountStore {
    public override val __627606157_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2019045562_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2019045562_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataAccountStore3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8142c094f3c9478bb1176585bebb6789")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataAccountStore3(ptr: Pointer?): WithDefault =
        IUserDataAccountStore3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserDataAccountStore3 {
      val address = segment.toRawLongValue()
      return makeIUserDataAccountStore3(Pointer(address))
    }

    public override fun toNative(obj: IUserDataAccountStore3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2019045562_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataAccountStore3): Array<IUserDataAccountStore3?> =
        (elements as
        Array<IUserDataAccountStore3?>).castToImpl<IUserDataAccountStore3,IUserDataAccountStore3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataAccountStore3?> =
        arrayOfNulls<IUserDataAccountStore3_Impl>(size) as Array<IUserDataAccountStore3?>
  }
}
