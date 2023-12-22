package Windows.Networking

import Windows.Networking.Connectivity.IPInformation
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

@ABIMarker(IHostName.ABI::class)
@Signature("{bf8ecaad-ed96-49a7-9084-d416cae88dcb}")
@Guid("bf8ecaaded9649a79084d416cae88dcb")
@WinRTInterface("bf8ecaaded9649a79084d416cae88dcb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHostName.ByReference::class)
public interface IHostName : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IPInformation(): IPInformation?

  @InterfaceMethod(1)
  public fun get_RawName(): String?

  @InterfaceMethod(2)
  public fun get_DisplayName(): String?

  @InterfaceMethod(3)
  public fun get_CanonicalName(): String?

  @InterfaceMethod(4)
  public fun get_Type(): HostNameType?

  @InterfaceMethod(5)
  public fun IsEqual(hostName: HostName?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IHostName> {
    public override fun getValue() = ABI.makeIHostName(pointer.getPointer(0))

    public fun setValue(value: IHostName_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHostName {
    public val __175440099_Ptr: Pointer?

    public val _175440099_VtblPtr: Pointer?
      get() = __175440099_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IPInformation(): IPInformation? {
      val fnPtr = _175440099_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IPInformation>()
      val hr = fn.invokeHR(arrayOf(__175440099_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IPInformation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RawName(): String? {
      val fnPtr = _175440099_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__175440099_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DisplayName(): String? {
      val fnPtr = _175440099_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__175440099_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_CanonicalName(): String? {
      val fnPtr = _175440099_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__175440099_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Type(): HostNameType? {
      val fnPtr = _175440099_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HostNameType>()
      val hr = fn.invokeHR(arrayOf(__175440099_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HostNameType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun IsEqual(hostName: HostName?): Boolean {
      val fnPtr = _175440099_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__175440099_Ptr, marshalToNative(hostName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IHostName_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __175440099_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHostName, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bf8ecaaded9649a79084d416cae88dcb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHostName(ptr: Pointer?): WithDefault = IHostName_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHostName {
      val address = segment.toRawLongValue()
      return makeIHostName(Pointer(address))
    }

    public override fun toNative(obj: IHostName): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__175440099_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHostName): Array<IHostName?> = (elements as
        Array<IHostName?>).castToImpl<IHostName,IHostName_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHostName?> = arrayOfNulls<IHostName_Impl>(size)
        as Array<IHostName?>
  }
}
