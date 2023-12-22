package Windows.Security.Authentication.Web.Provider

import Windows.Security.Authentication.Web.Provider.IWebAccountProviderOperation.ABI.IID
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebAccountProviderAddAccountOperation.ABI::class)
@Signature("{73ebdccf-4378-4c79-9335-a5d7ab81594e}")
@Guid("73ebdccf43784c799335a5d7ab81594e")
@WinRTInterface("73ebdccf43784c799335a5d7ab81594e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAccountProviderAddAccountOperation.ByReference::class)
public interface IWebAccountProviderAddAccountOperation : NativeMapped, IWinRTInterface,
    IWebAccountProviderOperation {
  @InterfaceMethod(0)
  public fun ReportCompleted(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAccountProviderAddAccountOperation> {
    public override fun getValue() =
        ABI.makeIWebAccountProviderAddAccountOperation(pointer.getPointer(0))

    public fun setValue(value: IWebAccountProviderAddAccountOperation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAccountProviderAddAccountOperation,
      IWebAccountProviderOperation.WithDefault {
    public val __1278353350_Ptr: Pointer?

    public val _1278353350_VtblPtr: Pointer?
      get() = __1278353350_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReportCompleted(): Unit {
      val fnPtr = _1278353350_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1278353350_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebAccountProviderAddAccountOperation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IWebAccountProviderOperation {
    public override val __1287167602_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1278353350_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1278353350_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAccountProviderAddAccountOperation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("73ebdccf43784c799335a5d7ab81594e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAccountProviderAddAccountOperation(ptr: Pointer?): WithDefault =
        IWebAccountProviderAddAccountOperation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAccountProviderAddAccountOperation {
      val address = segment.toRawLongValue()
      return makeIWebAccountProviderAddAccountOperation(Pointer(address))
    }

    public override fun toNative(obj: IWebAccountProviderAddAccountOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1278353350_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAccountProviderAddAccountOperation):
        Array<IWebAccountProviderAddAccountOperation?> = (elements as
        Array<IWebAccountProviderAddAccountOperation?>).castToImpl<IWebAccountProviderAddAccountOperation,IWebAccountProviderAddAccountOperation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAccountProviderAddAccountOperation?> =
        arrayOfNulls<IWebAccountProviderAddAccountOperation_Impl>(size) as
        Array<IWebAccountProviderAddAccountOperation?>
  }
}
