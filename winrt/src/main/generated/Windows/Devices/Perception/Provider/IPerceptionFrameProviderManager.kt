package Windows.Devices.Perception.Provider

import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
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

@ABIMarker(IPerceptionFrameProviderManager.ABI::class)
@Signature("{a959ce07-ead3-33df-8ec1-b924abe019c4}")
@Guid("a959ce07ead333df8ec1b924abe019c4")
@WinRTInterface("a959ce07ead333df8ec1b924abe019c4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionFrameProviderManager.ByReference::class)
public interface IPerceptionFrameProviderManager : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun GetFrameProvider(frameProviderInfo: PerceptionFrameProviderInfo?):
      IPerceptionFrameProvider?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionFrameProviderManager> {
    public override fun getValue() = ABI.makeIPerceptionFrameProviderManager(pointer.getPointer(0))

    public fun setValue(value: IPerceptionFrameProviderManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionFrameProviderManager, IClosable.WithDefault {
    public val __119434977_Ptr: Pointer?

    public val _119434977_VtblPtr: Pointer?
      get() = __119434977_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetFrameProvider(frameProviderInfo: PerceptionFrameProviderInfo?):
        IPerceptionFrameProvider? {
      val fnPtr = _119434977_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IPerceptionFrameProvider>()
      val hr = fn.invokeHR(arrayOf(__119434977_Ptr, marshalToNative(frameProviderInfo), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IPerceptionFrameProvider>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionFrameProviderManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_119434977_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __119434977_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionFrameProviderManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a959ce07ead333df8ec1b924abe019c4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionFrameProviderManager(ptr: Pointer?): WithDefault =
        IPerceptionFrameProviderManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPerceptionFrameProviderManager {
      val address = segment.toRawLongValue()
      return makeIPerceptionFrameProviderManager(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionFrameProviderManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__119434977_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionFrameProviderManager):
        Array<IPerceptionFrameProviderManager?> = (elements as
        Array<IPerceptionFrameProviderManager?>).castToImpl<IPerceptionFrameProviderManager,IPerceptionFrameProviderManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionFrameProviderManager?> =
        arrayOfNulls<IPerceptionFrameProviderManager_Impl>(size) as
        Array<IPerceptionFrameProviderManager?>
  }
}
