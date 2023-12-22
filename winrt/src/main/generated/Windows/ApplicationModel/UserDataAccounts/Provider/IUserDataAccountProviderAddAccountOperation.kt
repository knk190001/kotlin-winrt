package Windows.ApplicationModel.UserDataAccounts.Provider

import Windows.ApplicationModel.UserDataAccounts.Provider.IUserDataAccountProviderOperation.ABI.IID
import Windows.ApplicationModel.UserDataAccounts.UserDataAccountContentKinds
import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IUserDataAccountProviderAddAccountOperation.ABI::class)
@Signature("{b9c72530-3f84-4b5d-8eaa-45e97aa842ed}")
@Guid("b9c725303f844b5d8eaa45e97aa842ed")
@WinRTInterface("b9c725303f844b5d8eaa45e97aa842ed")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataAccountProviderAddAccountOperation.ByReference::class)
public interface IUserDataAccountProviderAddAccountOperation : NativeMapped, IWinRTInterface,
    IUserDataAccountProviderOperation {
  @InterfaceMethod(0)
  public fun get_ContentKinds(): UserDataAccountContentKinds?

  @InterfaceMethod(1)
  public fun get_PartnerAccountInfos(): IVectorView<UserDataAccountPartnerAccountInfo?>?

  @InterfaceMethod(2)
  public fun ReportCompleted(userDataAccountId: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataAccountProviderAddAccountOperation> {
    public override fun getValue() =
        ABI.makeIUserDataAccountProviderAddAccountOperation(pointer.getPointer(0))

    public fun setValue(value: IUserDataAccountProviderAddAccountOperation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataAccountProviderAddAccountOperation,
      IUserDataAccountProviderOperation.WithDefault {
    public val __1276043711_Ptr: Pointer?

    public val _1276043711_VtblPtr: Pointer?
      get() = __1276043711_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContentKinds(): UserDataAccountContentKinds? {
      val fnPtr = _1276043711_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataAccountContentKinds>()
      val hr = fn.invokeHR(arrayOf(__1276043711_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserDataAccountContentKinds>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PartnerAccountInfos():
        IVectorView<UserDataAccountPartnerAccountInfo?>? {
      val fnPtr = _1276043711_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<UserDataAccountPartnerAccountInfo?>>()
      val hr = fn.invokeHR(arrayOf(__1276043711_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<UserDataAccountPartnerAccountInfo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ReportCompleted(userDataAccountId: String?): Unit {
      val fnPtr = _1276043711_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1276043711_Ptr, marshalToNative(userDataAccountId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUserDataAccountProviderAddAccountOperation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      IUserDataAccountProviderOperation {
    public override val __2091816275_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1276043711_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1276043711_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataAccountProviderAddAccountOperation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b9c725303f844b5d8eaa45e97aa842ed")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataAccountProviderAddAccountOperation(ptr: Pointer?): WithDefault =
        IUserDataAccountProviderAddAccountOperation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IUserDataAccountProviderAddAccountOperation {
      val address = segment.toRawLongValue()
      return makeIUserDataAccountProviderAddAccountOperation(Pointer(address))
    }

    public override fun toNative(obj: IUserDataAccountProviderAddAccountOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1276043711_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataAccountProviderAddAccountOperation):
        Array<IUserDataAccountProviderAddAccountOperation?> = (elements as
        Array<IUserDataAccountProviderAddAccountOperation?>).castToImpl<IUserDataAccountProviderAddAccountOperation,IUserDataAccountProviderAddAccountOperation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataAccountProviderAddAccountOperation?> =
        arrayOfNulls<IUserDataAccountProviderAddAccountOperation_Impl>(size) as
        Array<IUserDataAccountProviderAddAccountOperation?>
  }
}
