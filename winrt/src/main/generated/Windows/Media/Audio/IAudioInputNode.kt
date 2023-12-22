package Windows.Media.Audio

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IClosable
import Windows.Media.Audio.IAudioNode.ABI.IID
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAudioInputNode.ABI::class)
@Signature("{d148005c-8428-4784-b7fd-a99d468c5d20}")
@Guid("d148005c84284784b7fda99d468c5d20")
@WinRTInterface("d148005c84284784b7fda99d468c5d20")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioInputNode.ByReference::class)
public interface IAudioInputNode : NativeMapped, IWinRTInterface, IAudioNode, IClosable {
  @InterfaceMethod(0)
  public fun get_OutgoingConnections(): IVectorView<AudioGraphConnection?>?

  @InterfaceMethod(1)
  public fun AddOutgoingConnection(destination: IAudioNode?): Unit

  @InterfaceMethod(2)
  public fun AddOutgoingConnection(destination: IAudioNode?, gain: Double): Unit

  @InterfaceMethod(3)
  public fun RemoveOutgoingConnection(destination: IAudioNode?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioInputNode> {
    public override fun getValue() = ABI.makeIAudioInputNode(pointer.getPointer(0))

    public fun setValue(value: IAudioInputNode_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioInputNode, IAudioNode.WithDefault, IClosable.WithDefault {
    public val __801834558_Ptr: Pointer?

    public val _801834558_VtblPtr: Pointer?
      get() = __801834558_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OutgoingConnections(): IVectorView<AudioGraphConnection?>? {
      val fnPtr = _801834558_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<AudioGraphConnection?>>()
      val hr = fn.invokeHR(arrayOf(__801834558_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<AudioGraphConnection?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun AddOutgoingConnection(destination: IAudioNode?): Unit {
      val fnPtr = _801834558_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__801834558_Ptr, marshalToNative(destination),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun AddOutgoingConnection(destination: IAudioNode?, gain: Double): Unit {
      val fnPtr = _801834558_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__801834558_Ptr, marshalToNative(destination), gain,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun RemoveOutgoingConnection(destination: IAudioNode?): Unit {
      val fnPtr = _801834558_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__801834558_Ptr, marshalToNative(destination),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAudioInputNode_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IAudioNode, IClosable {
    public override val __1950949744_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_801834558_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IClosable.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_801834558_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __801834558_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioInputNode, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d148005c84284784b7fda99d468c5d20")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioInputNode(ptr: Pointer?): WithDefault = IAudioInputNode_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioInputNode {
      val address = segment.toRawLongValue()
      return makeIAudioInputNode(Pointer(address))
    }

    public override fun toNative(obj: IAudioInputNode): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__801834558_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioInputNode): Array<IAudioInputNode?> = (elements as
        Array<IAudioInputNode?>).castToImpl<IAudioInputNode,IAudioInputNode_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioInputNode?> =
        arrayOfNulls<IAudioInputNode_Impl>(size) as Array<IAudioInputNode?>
  }
}
