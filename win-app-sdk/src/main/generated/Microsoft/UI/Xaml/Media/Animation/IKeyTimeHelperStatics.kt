package Microsoft.UI.Xaml.Media.Animation

import Windows.Foundation.TimeSpan
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

@ABIMarker(IKeyTimeHelperStatics.ABI::class)
@Signature("{ae5d22c9-0fdb-5823-8846-8a4d0b9eebfa}")
@Guid("ae5d22c90fdb582388468a4d0b9eebfa")
@WinRTInterface("ae5d22c90fdb582388468a4d0b9eebfa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyTimeHelperStatics.ByReference::class)
public interface IKeyTimeHelperStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromTimeSpan(timeSpan: TimeSpan?): KeyTime?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyTimeHelperStatics> {
    public override fun getValue() = ABI.makeIKeyTimeHelperStatics(pointer.getPointer(0))

    public fun setValue(value: IKeyTimeHelperStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyTimeHelperStatics {
    public val __1750964154_Ptr: Pointer?

    public val _1750964154_VtblPtr: Pointer?
      get() = __1750964154_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromTimeSpan(timeSpan: TimeSpan?): KeyTime? {
      val fnPtr = _1750964154_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<KeyTime>()
      val hr = fn.invokeHR(arrayOf(__1750964154_Ptr, marshalToNative(timeSpan), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<KeyTime>(result.getValue())
      return resultValue
    }
  }

  public class IKeyTimeHelperStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1750964154_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyTimeHelperStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ae5d22c90fdb582388468a4d0b9eebfa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyTimeHelperStatics(ptr: Pointer?): WithDefault =
        IKeyTimeHelperStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyTimeHelperStatics {
      val address = segment.toRawLongValue()
      return makeIKeyTimeHelperStatics(Pointer(address))
    }

    public override fun toNative(obj: IKeyTimeHelperStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1750964154_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyTimeHelperStatics): Array<IKeyTimeHelperStatics?> =
        (elements as
        Array<IKeyTimeHelperStatics?>).castToImpl<IKeyTimeHelperStatics,IKeyTimeHelperStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyTimeHelperStatics?> =
        arrayOfNulls<IKeyTimeHelperStatics_Impl>(size) as Array<IKeyTimeHelperStatics?>
  }
}
