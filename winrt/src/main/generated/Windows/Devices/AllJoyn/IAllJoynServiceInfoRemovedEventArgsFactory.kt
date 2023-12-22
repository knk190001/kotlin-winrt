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

@ABIMarker(IAllJoynServiceInfoRemovedEventArgsFactory.ABI::class)
@Signature("{0dbf8627-9aff-4955-9227-6953baf41569}")
@Guid("0dbf86279aff495592276953baf41569")
@WinRTInterface("0dbf86279aff495592276953baf41569")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAllJoynServiceInfoRemovedEventArgsFactory.ByReference::class)
public interface IAllJoynServiceInfoRemovedEventArgsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(uniqueName: String?): AllJoynServiceInfoRemovedEventArgs?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAllJoynServiceInfoRemovedEventArgsFactory> {
    public override fun getValue() =
        ABI.makeIAllJoynServiceInfoRemovedEventArgsFactory(pointer.getPointer(0))

    public fun setValue(value: IAllJoynServiceInfoRemovedEventArgsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAllJoynServiceInfoRemovedEventArgsFactory {
    public val __802570657_Ptr: Pointer?

    public val _802570657_VtblPtr: Pointer?
      get() = __802570657_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(uniqueName: String?): AllJoynServiceInfoRemovedEventArgs? {
      val fnPtr = _802570657_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AllJoynServiceInfoRemovedEventArgs>()
      val hr = fn.invokeHR(arrayOf(__802570657_Ptr, marshalToNative(uniqueName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AllJoynServiceInfoRemovedEventArgs>(result.getValue())
      return resultValue
    }
  }

  public class IAllJoynServiceInfoRemovedEventArgsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __802570657_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAllJoynServiceInfoRemovedEventArgsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0dbf86279aff495592276953baf41569")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAllJoynServiceInfoRemovedEventArgsFactory(ptr: Pointer?): WithDefault =
        IAllJoynServiceInfoRemovedEventArgsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAllJoynServiceInfoRemovedEventArgsFactory {
      val address = segment.toRawLongValue()
      return makeIAllJoynServiceInfoRemovedEventArgsFactory(Pointer(address))
    }

    public override fun toNative(obj: IAllJoynServiceInfoRemovedEventArgsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__802570657_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAllJoynServiceInfoRemovedEventArgsFactory):
        Array<IAllJoynServiceInfoRemovedEventArgsFactory?> = (elements as
        Array<IAllJoynServiceInfoRemovedEventArgsFactory?>).castToImpl<IAllJoynServiceInfoRemovedEventArgsFactory,IAllJoynServiceInfoRemovedEventArgsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAllJoynServiceInfoRemovedEventArgsFactory?> =
        arrayOfNulls<IAllJoynServiceInfoRemovedEventArgsFactory_Impl>(size) as
        Array<IAllJoynServiceInfoRemovedEventArgsFactory?>
  }
}
