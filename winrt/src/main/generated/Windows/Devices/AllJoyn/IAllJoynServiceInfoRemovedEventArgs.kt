package Windows.Devices.AllJoyn

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

@ABIMarker(IAllJoynServiceInfoRemovedEventArgs.ABI::class)
@Signature("{3057a95f-1d3f-41f3-8969-e32792627396}")
@Guid("3057a95f1d3f41f38969e32792627396")
@WinRTInterface("3057a95f1d3f41f38969e32792627396")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAllJoynServiceInfoRemovedEventArgs.ByReference::class)
public interface IAllJoynServiceInfoRemovedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UniqueName(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAllJoynServiceInfoRemovedEventArgs> {
    public override fun getValue() =
        ABI.makeIAllJoynServiceInfoRemovedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAllJoynServiceInfoRemovedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAllJoynServiceInfoRemovedEventArgs {
    public val __762173225_Ptr: Pointer?

    public val _762173225_VtblPtr: Pointer?
      get() = __762173225_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UniqueName(): String? {
      val fnPtr = _762173225_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__762173225_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAllJoynServiceInfoRemovedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __762173225_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAllJoynServiceInfoRemovedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3057a95f1d3f41f38969e32792627396")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAllJoynServiceInfoRemovedEventArgs(ptr: Pointer?): WithDefault =
        IAllJoynServiceInfoRemovedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAllJoynServiceInfoRemovedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAllJoynServiceInfoRemovedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAllJoynServiceInfoRemovedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__762173225_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAllJoynServiceInfoRemovedEventArgs):
        Array<IAllJoynServiceInfoRemovedEventArgs?> = (elements as
        Array<IAllJoynServiceInfoRemovedEventArgs?>).castToImpl<IAllJoynServiceInfoRemovedEventArgs,IAllJoynServiceInfoRemovedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAllJoynServiceInfoRemovedEventArgs?> =
        arrayOfNulls<IAllJoynServiceInfoRemovedEventArgs_Impl>(size) as
        Array<IAllJoynServiceInfoRemovedEventArgs?>
  }
}
