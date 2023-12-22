package Windows.UI.Input.Core

import Windows.System.DispatcherQueue
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

@ABIMarker(IRadialControllerIndependentInputSource2.ABI::class)
@Signature("{7073aad8-35f3-4eeb-8751-be4d0a66faf4}")
@Guid("7073aad835f34eeb8751be4d0a66faf4")
@WinRTInterface("7073aad835f34eeb8751be4d0a66faf4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadialControllerIndependentInputSource2.ByReference::class)
public interface IRadialControllerIndependentInputSource2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DispatcherQueue(): DispatcherQueue?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRadialControllerIndependentInputSource2> {
    public override fun getValue() =
        ABI.makeIRadialControllerIndependentInputSource2(pointer.getPointer(0))

    public fun setValue(value: IRadialControllerIndependentInputSource2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadialControllerIndependentInputSource2 {
    public val __1836139627_Ptr: Pointer?

    public val _1836139627_VtblPtr: Pointer?
      get() = __1836139627_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DispatcherQueue(): DispatcherQueue? {
      val fnPtr = _1836139627_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DispatcherQueue>()
      val hr = fn.invokeHR(arrayOf(__1836139627_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DispatcherQueue>(result.getValue())
      return resultValue
    }
  }

  public class IRadialControllerIndependentInputSource2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1836139627_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadialControllerIndependentInputSource2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7073aad835f34eeb8751be4d0a66faf4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadialControllerIndependentInputSource2(ptr: Pointer?): WithDefault =
        IRadialControllerIndependentInputSource2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IRadialControllerIndependentInputSource2 {
      val address = segment.toRawLongValue()
      return makeIRadialControllerIndependentInputSource2(Pointer(address))
    }

    public override fun toNative(obj: IRadialControllerIndependentInputSource2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1836139627_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadialControllerIndependentInputSource2):
        Array<IRadialControllerIndependentInputSource2?> = (elements as
        Array<IRadialControllerIndependentInputSource2?>).castToImpl<IRadialControllerIndependentInputSource2,IRadialControllerIndependentInputSource2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadialControllerIndependentInputSource2?> =
        arrayOfNulls<IRadialControllerIndependentInputSource2_Impl>(size) as
        Array<IRadialControllerIndependentInputSource2?>
  }
}
