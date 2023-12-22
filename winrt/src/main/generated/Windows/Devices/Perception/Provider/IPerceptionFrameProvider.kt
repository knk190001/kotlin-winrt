package Windows.Devices.Perception.Provider

import Windows.Foundation.Collections.IPropertySet
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPerceptionFrameProvider.ABI::class)
@Signature("{794f7ab9-b37d-3b33-a10d-30626419ce65}")
@Guid("794f7ab9b37d3b33a10d30626419ce65")
@WinRTInterface("794f7ab9b37d3b33a10d30626419ce65")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionFrameProvider.ByReference::class)
public interface IPerceptionFrameProvider : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_FrameProviderInfo(): PerceptionFrameProviderInfo?

  @InterfaceMethod(1)
  public fun get_Available(): Boolean

  @InterfaceMethod(2)
  public fun get_Properties(): IPropertySet?

  @InterfaceMethod(3)
  public fun Start(): Unit

  @InterfaceMethod(4)
  public fun Stop(): Unit

  @InterfaceMethod(5)
  public fun SetProperty(value: PerceptionPropertyChangeRequest?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionFrameProvider> {
    public override fun getValue() = ABI.makeIPerceptionFrameProvider(pointer.getPointer(0))

    public fun setValue(value: IPerceptionFrameProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionFrameProvider, IClosable.WithDefault {
    public val __1540347566_Ptr: Pointer?

    public val _1540347566_VtblPtr: Pointer?
      get() = __1540347566_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FrameProviderInfo(): PerceptionFrameProviderInfo? {
      val fnPtr = _1540347566_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PerceptionFrameProviderInfo>()
      val hr = fn.invokeHR(arrayOf(__1540347566_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PerceptionFrameProviderInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Available(): Boolean {
      val fnPtr = _1540347566_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1540347566_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Properties(): IPropertySet? {
      val fnPtr = _1540347566_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IPropertySet>()
      val hr = fn.invokeHR(arrayOf(__1540347566_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IPropertySet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun Start(): Unit {
      val fnPtr = _1540347566_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1540347566_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun Stop(): Unit {
      val fnPtr = _1540347566_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1540347566_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun SetProperty(value: PerceptionPropertyChangeRequest?): Unit {
      val fnPtr = _1540347566_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1540347566_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPerceptionFrameProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1540347566_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1540347566_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionFrameProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("794f7ab9b37d3b33a10d30626419ce65")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionFrameProvider(ptr: Pointer?): WithDefault =
        IPerceptionFrameProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPerceptionFrameProvider {
      val address = segment.toRawLongValue()
      return makeIPerceptionFrameProvider(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionFrameProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1540347566_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionFrameProvider):
        Array<IPerceptionFrameProvider?> = (elements as
        Array<IPerceptionFrameProvider?>).castToImpl<IPerceptionFrameProvider,IPerceptionFrameProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionFrameProvider?> =
        arrayOfNulls<IPerceptionFrameProvider_Impl>(size) as Array<IPerceptionFrameProvider?>
  }
}
