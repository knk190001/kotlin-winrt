package Windows.Storage

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

@ABIMarker(IApplicationDataStatics.ABI::class)
@Signature("{5612147b-e843-45e3-94d8-06169e3c8e17}")
@Guid("5612147be84345e394d806169e3c8e17")
@WinRTInterface("5612147be84345e394d806169e3c8e17")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationDataStatics.ByReference::class)
public interface IApplicationDataStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Current(): ApplicationData?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationDataStatics> {
    public override fun getValue() = ABI.makeIApplicationDataStatics(pointer.getPointer(0))

    public fun setValue(value: IApplicationDataStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationDataStatics {
    public val __1219561764_Ptr: Pointer?

    public val _1219561764_VtblPtr: Pointer?
      get() = __1219561764_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Current(): ApplicationData? {
      val fnPtr = _1219561764_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ApplicationData>()
      val hr = fn.invokeHR(arrayOf(__1219561764_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ApplicationData>(result.getValue())
      return resultValue
    }
  }

  public class IApplicationDataStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1219561764_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationDataStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5612147be84345e394d806169e3c8e17")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationDataStatics(ptr: Pointer?): WithDefault =
        IApplicationDataStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationDataStatics {
      val address = segment.toRawLongValue()
      return makeIApplicationDataStatics(Pointer(address))
    }

    public override fun toNative(obj: IApplicationDataStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1219561764_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationDataStatics): Array<IApplicationDataStatics?>
        = (elements as
        Array<IApplicationDataStatics?>).castToImpl<IApplicationDataStatics,IApplicationDataStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationDataStatics?> =
        arrayOfNulls<IApplicationDataStatics_Impl>(size) as Array<IApplicationDataStatics?>
  }
}
