package Windows.UI.Xaml

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDebugSettings3.ABI::class)
@Signature("{e6bb5022-0625-479f-8e32-4b583d73b7ac}")
@Guid("e6bb50220625479f8e324b583d73b7ac")
@WinRTInterface("e6bb50220625479f8e324b583d73b7ac")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDebugSettings3.ByReference::class)
public interface IDebugSettings3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsTextPerformanceVisualizationEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsTextPerformanceVisualizationEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDebugSettings3> {
    public override fun getValue() = ABI.makeIDebugSettings3(pointer.getPointer(0))

    public fun setValue(value: IDebugSettings3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDebugSettings3 {
    public val __915410479_Ptr: Pointer?

    public val _915410479_VtblPtr: Pointer?
      get() = __915410479_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsTextPerformanceVisualizationEnabled(): Boolean {
      val fnPtr = _915410479_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__915410479_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsTextPerformanceVisualizationEnabled(value: Boolean): Unit {
      val fnPtr = _915410479_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__915410479_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDebugSettings3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __915410479_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDebugSettings3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e6bb50220625479f8e324b583d73b7ac")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDebugSettings3(ptr: Pointer?): WithDefault = IDebugSettings3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDebugSettings3 {
      val address = segment.toRawLongValue()
      return makeIDebugSettings3(Pointer(address))
    }

    public override fun toNative(obj: IDebugSettings3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__915410479_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDebugSettings3): Array<IDebugSettings3?> = (elements as
        Array<IDebugSettings3?>).castToImpl<IDebugSettings3,IDebugSettings3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDebugSettings3?> =
        arrayOfNulls<IDebugSettings3_Impl>(size) as Array<IDebugSettings3?>
  }
}
