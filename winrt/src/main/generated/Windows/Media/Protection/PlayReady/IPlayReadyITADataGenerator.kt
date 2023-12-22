package Windows.Media.Protection.PlayReady

import Windows.Foundation.Collections.IPropertySet
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPlayReadyITADataGenerator.ABI::class)
@Signature("{24446b8e-10b9-4530-b25b-901a8029a9b2}")
@Guid("24446b8e10b94530b25b901a8029a9b2")
@WinRTInterface("24446b8e10b94530b25b901a8029a9b2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayReadyITADataGenerator.ByReference::class)
public interface IPlayReadyITADataGenerator : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GenerateData(
    guidCPSystemId: com.sun.jna.platform.win32.Guid.GUID?,
    countOfStreams: WinDef.UINT,
    configuration: IPropertySet?,
    format: PlayReadyITADataFormat?
  ): Array<Byte>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayReadyITADataGenerator> {
    public override fun getValue() = ABI.makeIPlayReadyITADataGenerator(pointer.getPointer(0))

    public fun setValue(value: IPlayReadyITADataGenerator_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayReadyITADataGenerator {
    public val __1911723400_Ptr: Pointer?

    public val _1911723400_VtblPtr: Pointer?
      get() = __1911723400_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GenerateData(
      guidCPSystemId: com.sun.jna.platform.win32.Guid.GUID?,
      countOfStreams: WinDef.UINT,
      configuration: IPropertySet?,
      format: PlayReadyITADataFormat?
    ): Array<Byte>? {
      val fnPtr = _1911723400_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makePrimitiveOutArray<Byte>()
      val hr = fn.invokeHR(arrayOf(__1911723400_Ptr, marshalToNative(guidCPSystemId),
          countOfStreams, marshalToNative(configuration), marshalToNative(format), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }
  }

  public class IPlayReadyITADataGenerator_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1911723400_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayReadyITADataGenerator, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("24446b8e10b94530b25b901a8029a9b2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayReadyITADataGenerator(ptr: Pointer?): WithDefault =
        IPlayReadyITADataGenerator_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayReadyITADataGenerator {
      val address = segment.toRawLongValue()
      return makeIPlayReadyITADataGenerator(Pointer(address))
    }

    public override fun toNative(obj: IPlayReadyITADataGenerator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1911723400_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayReadyITADataGenerator):
        Array<IPlayReadyITADataGenerator?> = (elements as
        Array<IPlayReadyITADataGenerator?>).castToImpl<IPlayReadyITADataGenerator,IPlayReadyITADataGenerator_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayReadyITADataGenerator?> =
        arrayOfNulls<IPlayReadyITADataGenerator_Impl>(size) as Array<IPlayReadyITADataGenerator?>
  }
}
