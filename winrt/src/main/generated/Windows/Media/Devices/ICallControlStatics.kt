package Windows.Media.Devices

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

@ABIMarker(ICallControlStatics.ABI::class)
@Signature("{03945ad5-85ab-40e1-af19-56c94303b019}")
@Guid("03945ad585ab40e1af1956c94303b019")
@WinRTInterface("03945ad585ab40e1af1956c94303b019")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICallControlStatics.ByReference::class)
public interface ICallControlStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): CallControl?

  @InterfaceMethod(1)
  public fun FromId(deviceId: String?): CallControl?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICallControlStatics> {
    public override fun getValue() = ABI.makeICallControlStatics(pointer.getPointer(0))

    public fun setValue(value: ICallControlStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICallControlStatics {
    public val __229165945_Ptr: Pointer?

    public val _229165945_VtblPtr: Pointer?
      get() = __229165945_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): CallControl? {
      val fnPtr = _229165945_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CallControl>()
      val hr = fn.invokeHR(arrayOf(__229165945_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CallControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FromId(deviceId: String?): CallControl? {
      val fnPtr = _229165945_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CallControl>()
      val hr = fn.invokeHR(arrayOf(__229165945_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CallControl>(result.getValue())
      return resultValue
    }
  }

  public class ICallControlStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __229165945_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICallControlStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("03945ad585ab40e1af1956c94303b019")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICallControlStatics(ptr: Pointer?): WithDefault = ICallControlStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICallControlStatics {
      val address = segment.toRawLongValue()
      return makeICallControlStatics(Pointer(address))
    }

    public override fun toNative(obj: ICallControlStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__229165945_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICallControlStatics): Array<ICallControlStatics?> =
        (elements as
        Array<ICallControlStatics?>).castToImpl<ICallControlStatics,ICallControlStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICallControlStatics?> =
        arrayOfNulls<ICallControlStatics_Impl>(size) as Array<ICallControlStatics?>
  }
}
