package Windows.System.RemoteSystems

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IRemoteSystem5.ABI::class)
@Signature("{eb2ad723-e5e2-4ae2-a7a7-a1097a098e90}")
@Guid("eb2ad723e5e24ae2a7a7a1097a098e90")
@WinRTInterface("eb2ad723e5e24ae2a7a7a1097a098e90")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystem5.ByReference::class)
public interface IRemoteSystem5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Apps(): IVectorView<RemoteSystemApp?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IRemoteSystem5>
      {
    public override fun getValue() = ABI.makeIRemoteSystem5(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystem5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystem5 {
    public val __675573665_Ptr: Pointer?

    public val _675573665_VtblPtr: Pointer?
      get() = __675573665_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Apps(): IVectorView<RemoteSystemApp?>? {
      val fnPtr = _675573665_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<RemoteSystemApp?>>()
      val hr = fn.invokeHR(arrayOf(__675573665_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<RemoteSystemApp?>>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystem5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __675573665_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystem5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eb2ad723e5e24ae2a7a7a1097a098e90")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystem5(ptr: Pointer?): WithDefault = IRemoteSystem5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystem5 {
      val address = segment.toRawLongValue()
      return makeIRemoteSystem5(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystem5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__675573665_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystem5): Array<IRemoteSystem5?> = (elements as
        Array<IRemoteSystem5?>).castToImpl<IRemoteSystem5,IRemoteSystem5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystem5?> =
        arrayOfNulls<IRemoteSystem5_Impl>(size) as Array<IRemoteSystem5?>
  }
}
