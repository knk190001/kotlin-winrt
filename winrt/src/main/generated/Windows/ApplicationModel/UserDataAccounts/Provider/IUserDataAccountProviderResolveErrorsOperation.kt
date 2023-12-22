package Windows.ApplicationModel.UserDataAccounts.Provider

import Windows.ApplicationModel.UserDataAccounts.Provider.IUserDataAccountProviderOperation.ABI.IID
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

@ABIMarker(IUserDataAccountProviderResolveErrorsOperation.ABI::class)
@Signature("{6235dc15-bfcb-41e1-9957-9759a28846cc}")
@Guid("6235dc15bfcb41e199579759a28846cc")
@WinRTInterface("6235dc15bfcb41e199579759a28846cc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataAccountProviderResolveErrorsOperation.ByReference::class)
public interface IUserDataAccountProviderResolveErrorsOperation : NativeMapped, IWinRTInterface,
    IUserDataAccountProviderOperation {
  @InterfaceMethod(0)
  public fun get_UserDataAccountId(): String?

  @InterfaceMethod(1)
  public fun ReportCompleted(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataAccountProviderResolveErrorsOperation> {
    public override fun getValue() =
        ABI.makeIUserDataAccountProviderResolveErrorsOperation(pointer.getPointer(0))

    public fun setValue(value: IUserDataAccountProviderResolveErrorsOperation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataAccountProviderResolveErrorsOperation,
      IUserDataAccountProviderOperation.WithDefault {
    public val __1274021078_Ptr: Pointer?

    public val _1274021078_VtblPtr: Pointer?
      get() = __1274021078_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UserDataAccountId(): String? {
      val fnPtr = _1274021078_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1274021078_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ReportCompleted(): Unit {
      val fnPtr = _1274021078_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1274021078_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUserDataAccountProviderResolveErrorsOperation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      IUserDataAccountProviderOperation {
    public override val __2091816275_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1274021078_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1274021078_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataAccountProviderResolveErrorsOperation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6235dc15bfcb41e199579759a28846cc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataAccountProviderResolveErrorsOperation(ptr: Pointer?): WithDefault =
        IUserDataAccountProviderResolveErrorsOperation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IUserDataAccountProviderResolveErrorsOperation {
      val address = segment.toRawLongValue()
      return makeIUserDataAccountProviderResolveErrorsOperation(Pointer(address))
    }

    public override fun toNative(obj: IUserDataAccountProviderResolveErrorsOperation): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1274021078_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataAccountProviderResolveErrorsOperation):
        Array<IUserDataAccountProviderResolveErrorsOperation?> = (elements as
        Array<IUserDataAccountProviderResolveErrorsOperation?>).castToImpl<IUserDataAccountProviderResolveErrorsOperation,IUserDataAccountProviderResolveErrorsOperation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataAccountProviderResolveErrorsOperation?> =
        arrayOfNulls<IUserDataAccountProviderResolveErrorsOperation_Impl>(size) as
        Array<IUserDataAccountProviderResolveErrorsOperation?>
  }
}
