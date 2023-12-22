package Windows.System.RemoteSystems

import Windows.Foundation.Collections.IMap
import Windows.Foundation.IAsyncOperation
import Windows.System.User
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

@ABIMarker(IRemoteSystemAppRegistration.ABI::class)
@Signature("{b47947b5-7035-4a5a-b8df-962d8f8431f4}")
@Guid("b47947b570354a5ab8df962d8f8431f4")
@WinRTInterface("b47947b570354a5ab8df962d8f8431f4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemAppRegistration.ByReference::class)
public interface IRemoteSystemAppRegistration : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_User(): User?

  @InterfaceMethod(1)
  public fun get_Attributes(): IMap<String?, String?>?

  @InterfaceMethod(2)
  public fun SaveAsync(): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemAppRegistration> {
    public override fun getValue() = ABI.makeIRemoteSystemAppRegistration(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemAppRegistration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemAppRegistration {
    public val __558319558_Ptr: Pointer?

    public val _558319558_VtblPtr: Pointer?
      get() = __558319558_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_User(): User? {
      val fnPtr = _558319558_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__558319558_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Attributes(): IMap<String?, String?>? {
      val fnPtr = _558319558_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<String?, String?>>()
      val hr = fn.invokeHR(arrayOf(__558319558_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<String?, String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SaveAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _558319558_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__558319558_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemAppRegistration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __558319558_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemAppRegistration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b47947b570354a5ab8df962d8f8431f4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemAppRegistration(ptr: Pointer?): WithDefault =
        IRemoteSystemAppRegistration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemAppRegistration {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemAppRegistration(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemAppRegistration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__558319558_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemAppRegistration):
        Array<IRemoteSystemAppRegistration?> = (elements as
        Array<IRemoteSystemAppRegistration?>).castToImpl<IRemoteSystemAppRegistration,IRemoteSystemAppRegistration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemAppRegistration?> =
        arrayOfNulls<IRemoteSystemAppRegistration_Impl>(size) as
        Array<IRemoteSystemAppRegistration?>
  }
}
