package Windows.Services.Maps

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

@ABIMarker(IMapManagerStatics.ABI::class)
@Signature("{37e3e515-82b4-4d54-8fd9-af2624b3011c}")
@Guid("37e3e51582b44d548fd9af2624b3011c")
@WinRTInterface("37e3e51582b44d548fd9af2624b3011c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapManagerStatics.ByReference::class)
public interface IMapManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ShowDownloadedMapsUI(): Unit

  @InterfaceMethod(1)
  public fun ShowMapsUpdateUI(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapManagerStatics> {
    public override fun getValue() = ABI.makeIMapManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IMapManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapManagerStatics {
    public val __2019638937_Ptr: Pointer?

    public val _2019638937_VtblPtr: Pointer?
      get() = __2019638937_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ShowDownloadedMapsUI(): Unit {
      val fnPtr = _2019638937_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2019638937_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun ShowMapsUpdateUI(): Unit {
      val fnPtr = _2019638937_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2019638937_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMapManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2019638937_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("37e3e51582b44d548fd9af2624b3011c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapManagerStatics(ptr: Pointer?): WithDefault = IMapManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapManagerStatics {
      val address = segment.toRawLongValue()
      return makeIMapManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IMapManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2019638937_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapManagerStatics): Array<IMapManagerStatics?> =
        (elements as
        Array<IMapManagerStatics?>).castToImpl<IMapManagerStatics,IMapManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapManagerStatics?> =
        arrayOfNulls<IMapManagerStatics_Impl>(size) as Array<IMapManagerStatics?>
  }
}
