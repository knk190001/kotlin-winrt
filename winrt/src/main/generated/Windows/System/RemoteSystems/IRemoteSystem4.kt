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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRemoteSystem4.ABI::class)
@Signature("{f164ffe5-b987-4ca5-9926-fa0438be6273}")
@Guid("f164ffe5b9874ca59926fa0438be6273")
@WinRTInterface("f164ffe5b9874ca59926fa0438be6273")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystem4.ByReference::class)
public interface IRemoteSystem4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Platform(): RemoteSystemPlatform?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IRemoteSystem4>
      {
    public override fun getValue() = ABI.makeIRemoteSystem4(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystem4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystem4 {
    public val __675573664_Ptr: Pointer?

    public val _675573664_VtblPtr: Pointer?
      get() = __675573664_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Platform(): RemoteSystemPlatform? {
      val fnPtr = _675573664_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemPlatform>()
      val hr = fn.invokeHR(arrayOf(__675573664_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemPlatform>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystem4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __675573664_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystem4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f164ffe5b9874ca59926fa0438be6273")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystem4(ptr: Pointer?): WithDefault = IRemoteSystem4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystem4 {
      val address = segment.toRawLongValue()
      return makeIRemoteSystem4(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystem4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__675573664_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystem4): Array<IRemoteSystem4?> = (elements as
        Array<IRemoteSystem4?>).castToImpl<IRemoteSystem4,IRemoteSystem4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystem4?> =
        arrayOfNulls<IRemoteSystem4_Impl>(size) as Array<IRemoteSystem4?>
  }
}
