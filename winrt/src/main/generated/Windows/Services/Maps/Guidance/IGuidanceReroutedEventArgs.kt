package Windows.Services.Maps.Guidance

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

@ABIMarker(IGuidanceReroutedEventArgs.ABI::class)
@Signature("{115d4008-d528-454e-bb94-a50341d2c9f1}")
@Guid("115d4008d528454ebb94a50341d2c9f1")
@WinRTInterface("115d4008d528454ebb94a50341d2c9f1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGuidanceReroutedEventArgs.ByReference::class)
public interface IGuidanceReroutedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Route(): GuidanceRoute?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGuidanceReroutedEventArgs> {
    public override fun getValue() = ABI.makeIGuidanceReroutedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IGuidanceReroutedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGuidanceReroutedEventArgs {
    public val __1395033362_Ptr: Pointer?

    public val _1395033362_VtblPtr: Pointer?
      get() = __1395033362_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Route(): GuidanceRoute? {
      val fnPtr = _1395033362_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GuidanceRoute>()
      val hr = fn.invokeHR(arrayOf(__1395033362_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GuidanceRoute>(result.getValue())
      return resultValue
    }
  }

  public class IGuidanceReroutedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1395033362_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGuidanceReroutedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("115d4008d528454ebb94a50341d2c9f1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGuidanceReroutedEventArgs(ptr: Pointer?): WithDefault =
        IGuidanceReroutedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGuidanceReroutedEventArgs {
      val address = segment.toRawLongValue()
      return makeIGuidanceReroutedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IGuidanceReroutedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1395033362_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGuidanceReroutedEventArgs):
        Array<IGuidanceReroutedEventArgs?> = (elements as
        Array<IGuidanceReroutedEventArgs?>).castToImpl<IGuidanceReroutedEventArgs,IGuidanceReroutedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGuidanceReroutedEventArgs?> =
        arrayOfNulls<IGuidanceReroutedEventArgs_Impl>(size) as Array<IGuidanceReroutedEventArgs?>
  }
}
