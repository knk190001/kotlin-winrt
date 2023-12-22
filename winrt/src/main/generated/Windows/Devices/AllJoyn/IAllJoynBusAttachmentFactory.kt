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

@ABIMarker(IAllJoynBusAttachmentFactory.ABI::class)
@Signature("{642ef1a4-ad85-4ddf-90ae-604452b22288}")
@Guid("642ef1a4ad854ddf90ae604452b22288")
@WinRTInterface("642ef1a4ad854ddf90ae604452b22288")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAllJoynBusAttachmentFactory.ByReference::class)
public interface IAllJoynBusAttachmentFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(connectionSpecification: String?): AllJoynBusAttachment?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAllJoynBusAttachmentFactory> {
    public override fun getValue() = ABI.makeIAllJoynBusAttachmentFactory(pointer.getPointer(0))

    public fun setValue(value: IAllJoynBusAttachmentFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAllJoynBusAttachmentFactory {
    public val __1585523528_Ptr: Pointer?

    public val _1585523528_VtblPtr: Pointer?
      get() = __1585523528_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(connectionSpecification: String?): AllJoynBusAttachment? {
      val fnPtr = _1585523528_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AllJoynBusAttachment>()
      val hr = fn.invokeHR(arrayOf(__1585523528_Ptr, marshalToNative(connectionSpecification),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AllJoynBusAttachment>(result.getValue())
      return resultValue
    }
  }

  public class IAllJoynBusAttachmentFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1585523528_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAllJoynBusAttachmentFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("642ef1a4ad854ddf90ae604452b22288")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAllJoynBusAttachmentFactory(ptr: Pointer?): WithDefault =
        IAllJoynBusAttachmentFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAllJoynBusAttachmentFactory {
      val address = segment.toRawLongValue()
      return makeIAllJoynBusAttachmentFactory(Pointer(address))
    }

    public override fun toNative(obj: IAllJoynBusAttachmentFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1585523528_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAllJoynBusAttachmentFactory):
        Array<IAllJoynBusAttachmentFactory?> = (elements as
        Array<IAllJoynBusAttachmentFactory?>).castToImpl<IAllJoynBusAttachmentFactory,IAllJoynBusAttachmentFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAllJoynBusAttachmentFactory?> =
        arrayOfNulls<IAllJoynBusAttachmentFactory_Impl>(size) as
        Array<IAllJoynBusAttachmentFactory?>
  }
}
