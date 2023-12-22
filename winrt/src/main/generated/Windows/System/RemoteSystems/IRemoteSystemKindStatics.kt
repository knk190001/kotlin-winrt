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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRemoteSystemKindStatics.ABI::class)
@Signature("{f6317633-ab14-41d0-9553-796aadb882db}")
@Guid("f6317633ab1441d09553796aadb882db")
@WinRTInterface("f6317633ab1441d09553796aadb882db")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemKindStatics.ByReference::class)
public interface IRemoteSystemKindStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Phone(): String?

  @InterfaceMethod(1)
  public fun get_Hub(): String?

  @InterfaceMethod(2)
  public fun get_Holographic(): String?

  @InterfaceMethod(3)
  public fun get_Desktop(): String?

  @InterfaceMethod(4)
  public fun get_Xbox(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemKindStatics> {
    public override fun getValue() = ABI.makeIRemoteSystemKindStatics(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemKindStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemKindStatics {
    public val __1444762147_Ptr: Pointer?

    public val _1444762147_VtblPtr: Pointer?
      get() = __1444762147_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Phone(): String? {
      val fnPtr = _1444762147_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1444762147_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Hub(): String? {
      val fnPtr = _1444762147_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1444762147_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Holographic(): String? {
      val fnPtr = _1444762147_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1444762147_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Desktop(): String? {
      val fnPtr = _1444762147_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1444762147_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Xbox(): String? {
      val fnPtr = _1444762147_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1444762147_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemKindStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1444762147_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemKindStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f6317633ab1441d09553796aadb882db")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemKindStatics(ptr: Pointer?): WithDefault =
        IRemoteSystemKindStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemKindStatics {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemKindStatics(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemKindStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1444762147_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemKindStatics):
        Array<IRemoteSystemKindStatics?> = (elements as
        Array<IRemoteSystemKindStatics?>).castToImpl<IRemoteSystemKindStatics,IRemoteSystemKindStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemKindStatics?> =
        arrayOfNulls<IRemoteSystemKindStatics_Impl>(size) as Array<IRemoteSystemKindStatics?>
  }
}
