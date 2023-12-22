package Windows.Media.Audio

import Windows.Devices.Enumeration.DeviceInformation
import Windows.Foundation.IClosable
import Windows.Media.Audio.IAudioInputNode.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IAudioDeviceInputNode.ABI::class)
@Signature("{b01b6be1-6f4e-49e2-ac01-559d62beb3a9}")
@Guid("b01b6be16f4e49e2ac01559d62beb3a9")
@WinRTInterface("b01b6be16f4e49e2ac01559d62beb3a9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioDeviceInputNode.ByReference::class)
public interface IAudioDeviceInputNode : NativeMapped, IWinRTInterface, IAudioInputNode, IAudioNode,
    IClosable {
  @InterfaceMethod(0)
  public fun get_Device(): DeviceInformation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioDeviceInputNode> {
    public override fun getValue() = ABI.makeIAudioDeviceInputNode(pointer.getPointer(0))

    public fun setValue(value: IAudioDeviceInputNode_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioDeviceInputNode, IAudioInputNode.WithDefault,
      IAudioNode.WithDefault, IClosable.WithDefault {
    public val __646315256_Ptr: Pointer?

    public val _646315256_VtblPtr: Pointer?
      get() = __646315256_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Device(): DeviceInformation? {
      val fnPtr = _646315256_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceInformation>()
      val hr = fn.invokeHR(arrayOf(__646315256_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceInformation>(result.getValue())
      return resultValue
    }
  }

  public class IAudioDeviceInputNode_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IAudioInputNode, IAudioNode,
      IClosable {
    public override val __801834558_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_646315256_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1950949744_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IAudioNode.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_646315256_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IClosable.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_646315256_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __646315256_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioDeviceInputNode, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b01b6be16f4e49e2ac01559d62beb3a9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioDeviceInputNode(ptr: Pointer?): WithDefault =
        IAudioDeviceInputNode_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioDeviceInputNode {
      val address = segment.toRawLongValue()
      return makeIAudioDeviceInputNode(Pointer(address))
    }

    public override fun toNative(obj: IAudioDeviceInputNode): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__646315256_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioDeviceInputNode): Array<IAudioDeviceInputNode?> =
        (elements as
        Array<IAudioDeviceInputNode?>).castToImpl<IAudioDeviceInputNode,IAudioDeviceInputNode_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioDeviceInputNode?> =
        arrayOfNulls<IAudioDeviceInputNode_Impl>(size) as Array<IAudioDeviceInputNode?>
  }
}
