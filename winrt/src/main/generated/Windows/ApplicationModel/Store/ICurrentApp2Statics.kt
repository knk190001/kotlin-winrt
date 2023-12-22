package Windows.ApplicationModel.Store

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(ICurrentApp2Statics.ABI::class)
@Signature("{df4e6e2d-3171-4ad3-8614-2c61244373cb}")
@Guid("df4e6e2d31714ad386142c61244373cb")
@WinRTInterface("df4e6e2d31714ad386142c61244373cb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICurrentApp2Statics.ByReference::class)
public interface ICurrentApp2Statics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCustomerPurchaseIdAsync(serviceTicket: String?, publisherUserId: String?):
      IAsyncOperation<String?>?

  @InterfaceMethod(1)
  public fun GetCustomerCollectionsIdAsync(serviceTicket: String?, publisherUserId: String?):
      IAsyncOperation<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICurrentApp2Statics> {
    public override fun getValue() = ABI.makeICurrentApp2Statics(pointer.getPointer(0))

    public fun setValue(value: ICurrentApp2Statics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICurrentApp2Statics {
    public val __610011763_Ptr: Pointer?

    public val _610011763_VtblPtr: Pointer?
      get() = __610011763_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCustomerPurchaseIdAsync(serviceTicket: String?,
        publisherUserId: String?): IAsyncOperation<String?>? {
      val fnPtr = _610011763_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__610011763_Ptr, marshalToNative(serviceTicket),
          marshalToNative(publisherUserId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetCustomerCollectionsIdAsync(serviceTicket: String?,
        publisherUserId: String?): IAsyncOperation<String?>? {
      val fnPtr = _610011763_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__610011763_Ptr, marshalToNative(serviceTicket),
          marshalToNative(publisherUserId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }
  }

  public class ICurrentApp2Statics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __610011763_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICurrentApp2Statics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("df4e6e2d31714ad386142c61244373cb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICurrentApp2Statics(ptr: Pointer?): WithDefault = ICurrentApp2Statics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICurrentApp2Statics {
      val address = segment.toRawLongValue()
      return makeICurrentApp2Statics(Pointer(address))
    }

    public override fun toNative(obj: ICurrentApp2Statics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__610011763_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICurrentApp2Statics): Array<ICurrentApp2Statics?> =
        (elements as
        Array<ICurrentApp2Statics?>).castToImpl<ICurrentApp2Statics,ICurrentApp2Statics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICurrentApp2Statics?> =
        arrayOfNulls<ICurrentApp2Statics_Impl>(size) as Array<ICurrentApp2Statics?>
  }
}
