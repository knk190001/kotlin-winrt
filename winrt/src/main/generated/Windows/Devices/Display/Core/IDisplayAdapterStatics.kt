package Windows.Devices.Display.Core

import Windows.Graphics.DisplayAdapterId
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

@ABIMarker(IDisplayAdapterStatics.ABI::class)
@Signature("{1dac3cda-481f-5469-8470-82c4ba680a28}")
@Guid("1dac3cda481f5469847082c4ba680a28")
@WinRTInterface("1dac3cda481f5469847082c4ba680a28")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayAdapterStatics.ByReference::class)
public interface IDisplayAdapterStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromId(id: DisplayAdapterId?): DisplayAdapter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayAdapterStatics> {
    public override fun getValue() = ABI.makeIDisplayAdapterStatics(pointer.getPointer(0))

    public fun setValue(value: IDisplayAdapterStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayAdapterStatics {
    public val __1793200278_Ptr: Pointer?

    public val _1793200278_VtblPtr: Pointer?
      get() = __1793200278_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromId(id: DisplayAdapterId?): DisplayAdapter? {
      val fnPtr = _1793200278_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayAdapter>()
      val hr = fn.invokeHR(arrayOf(__1793200278_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayAdapter>(result.getValue())
      return resultValue
    }
  }

  public class IDisplayAdapterStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1793200278_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayAdapterStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1dac3cda481f5469847082c4ba680a28")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayAdapterStatics(ptr: Pointer?): WithDefault =
        IDisplayAdapterStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayAdapterStatics {
      val address = segment.toRawLongValue()
      return makeIDisplayAdapterStatics(Pointer(address))
    }

    public override fun toNative(obj: IDisplayAdapterStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1793200278_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayAdapterStatics): Array<IDisplayAdapterStatics?> =
        (elements as
        Array<IDisplayAdapterStatics?>).castToImpl<IDisplayAdapterStatics,IDisplayAdapterStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayAdapterStatics?> =
        arrayOfNulls<IDisplayAdapterStatics_Impl>(size) as Array<IDisplayAdapterStatics?>
  }
}
