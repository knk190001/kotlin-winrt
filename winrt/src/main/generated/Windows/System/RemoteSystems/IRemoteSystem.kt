package Windows.System.RemoteSystems

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

@ABIMarker(IRemoteSystem.ABI::class)
@Signature("{ed5838cd-1e10-4a8c-b4a6-4e5fd6f97721}")
@Guid("ed5838cd1e104a8cb4a64e5fd6f97721")
@WinRTInterface("ed5838cd1e104a8cb4a64e5fd6f97721")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystem.ByReference::class)
public interface IRemoteSystem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DisplayName(): String?

  @InterfaceMethod(1)
  public fun get_Id(): String?

  @InterfaceMethod(2)
  public fun get_Kind(): String?

  @InterfaceMethod(3)
  public fun get_Status(): RemoteSystemStatus?

  @InterfaceMethod(4)
  public fun get_IsAvailableByProximity(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IRemoteSystem>
      {
    public override fun getValue() = ABI.makeIRemoteSystem(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystem {
    public val __1225133292_Ptr: Pointer?

    public val _1225133292_VtblPtr: Pointer?
      get() = __1225133292_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisplayName(): String? {
      val fnPtr = _1225133292_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1225133292_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Id(): String? {
      val fnPtr = _1225133292_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1225133292_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Kind(): String? {
      val fnPtr = _1225133292_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1225133292_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Status(): RemoteSystemStatus? {
      val fnPtr = _1225133292_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemStatus>()
      val hr = fn.invokeHR(arrayOf(__1225133292_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_IsAvailableByProximity(): Boolean {
      val fnPtr = _1225133292_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1225133292_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IRemoteSystem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1225133292_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ed5838cd1e104a8cb4a64e5fd6f97721")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystem(ptr: Pointer?): WithDefault = IRemoteSystem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystem {
      val address = segment.toRawLongValue()
      return makeIRemoteSystem(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1225133292_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystem): Array<IRemoteSystem?> = (elements as
        Array<IRemoteSystem?>).castToImpl<IRemoteSystem,IRemoteSystem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystem?> =
        arrayOfNulls<IRemoteSystem_Impl>(size) as Array<IRemoteSystem?>
  }
}
