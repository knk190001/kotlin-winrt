package Windows.Devices.SmartCards

import Windows.Storage.Streams.IBuffer
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

@ABIMarker(ISmartCardCryptogramPlacementStep.ABI::class)
@Signature("{947b03eb-8342-4792-a2e5-925636378a53}")
@Guid("947b03eb83424792a2e5925636378a53")
@WinRTInterface("947b03eb83424792a2e5925636378a53")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardCryptogramPlacementStep.ByReference::class)
public interface ISmartCardCryptogramPlacementStep : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Algorithm(): SmartCardCryptogramAlgorithm?

  @InterfaceMethod(1)
  public fun put_Algorithm(value: SmartCardCryptogramAlgorithm?): Unit

  @InterfaceMethod(2)
  public fun get_SourceData(): IBuffer?

  @InterfaceMethod(3)
  public fun put_SourceData(value: IBuffer?): Unit

  @InterfaceMethod(4)
  public fun get_CryptogramMaterialPackageName(): String?

  @InterfaceMethod(5)
  public fun put_CryptogramMaterialPackageName(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_CryptogramMaterialName(): String?

  @InterfaceMethod(7)
  public fun put_CryptogramMaterialName(value: String?): Unit

  @InterfaceMethod(8)
  public fun get_TemplateOffset(): Int

  @InterfaceMethod(9)
  public fun put_TemplateOffset(value: Int): Unit

  @InterfaceMethod(10)
  public fun get_CryptogramOffset(): Int

  @InterfaceMethod(11)
  public fun put_CryptogramOffset(value: Int): Unit

  @InterfaceMethod(12)
  public fun get_CryptogramLength(): Int

  @InterfaceMethod(13)
  public fun put_CryptogramLength(value: Int): Unit

  @InterfaceMethod(14)
  public fun get_CryptogramPlacementOptions(): SmartCardCryptogramPlacementOptions?

  @InterfaceMethod(15)
  public fun put_CryptogramPlacementOptions(value: SmartCardCryptogramPlacementOptions?): Unit

  @InterfaceMethod(16)
  public fun get_ChainedOutputStep(): SmartCardCryptogramPlacementStep?

  @InterfaceMethod(17)
  public fun put_ChainedOutputStep(value: SmartCardCryptogramPlacementStep?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardCryptogramPlacementStep> {
    public override fun getValue() =
        ABI.makeISmartCardCryptogramPlacementStep(pointer.getPointer(0))

    public fun setValue(value: ISmartCardCryptogramPlacementStep_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardCryptogramPlacementStep {
    public val __1885416557_Ptr: Pointer?

    public val _1885416557_VtblPtr: Pointer?
      get() = __1885416557_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Algorithm(): SmartCardCryptogramAlgorithm? {
      val fnPtr = _1885416557_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCardCryptogramAlgorithm>()
      val hr = fn.invokeHR(arrayOf(__1885416557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmartCardCryptogramAlgorithm>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Algorithm(value: SmartCardCryptogramAlgorithm?): Unit {
      val fnPtr = _1885416557_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1885416557_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_SourceData(): IBuffer? {
      val fnPtr = _1885416557_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1885416557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_SourceData(value: IBuffer?): Unit {
      val fnPtr = _1885416557_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1885416557_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_CryptogramMaterialPackageName(): String? {
      val fnPtr = _1885416557_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1885416557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_CryptogramMaterialPackageName(value: String?): Unit {
      val fnPtr = _1885416557_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1885416557_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_CryptogramMaterialName(): String? {
      val fnPtr = _1885416557_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1885416557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_CryptogramMaterialName(value: String?): Unit {
      val fnPtr = _1885416557_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1885416557_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_TemplateOffset(): Int {
      val fnPtr = _1885416557_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1885416557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_TemplateOffset(value: Int): Unit {
      val fnPtr = _1885416557_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1885416557_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_CryptogramOffset(): Int {
      val fnPtr = _1885416557_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1885416557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_CryptogramOffset(value: Int): Unit {
      val fnPtr = _1885416557_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1885416557_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_CryptogramLength(): Int {
      val fnPtr = _1885416557_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1885416557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_CryptogramLength(value: Int): Unit {
      val fnPtr = _1885416557_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1885416557_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_CryptogramPlacementOptions(): SmartCardCryptogramPlacementOptions? {
      val fnPtr = _1885416557_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCardCryptogramPlacementOptions>()
      val hr = fn.invokeHR(arrayOf(__1885416557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmartCardCryptogramPlacementOptions>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_CryptogramPlacementOptions(value: SmartCardCryptogramPlacementOptions?):
        Unit {
      val fnPtr = _1885416557_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1885416557_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_ChainedOutputStep(): SmartCardCryptogramPlacementStep? {
      val fnPtr = _1885416557_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCardCryptogramPlacementStep>()
      val hr = fn.invokeHR(arrayOf(__1885416557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmartCardCryptogramPlacementStep>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_ChainedOutputStep(value: SmartCardCryptogramPlacementStep?): Unit {
      val fnPtr = _1885416557_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1885416557_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISmartCardCryptogramPlacementStep_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1885416557_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardCryptogramPlacementStep, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("947b03eb83424792a2e5925636378a53")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardCryptogramPlacementStep(ptr: Pointer?): WithDefault =
        ISmartCardCryptogramPlacementStep_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardCryptogramPlacementStep {
      val address = segment.toRawLongValue()
      return makeISmartCardCryptogramPlacementStep(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardCryptogramPlacementStep): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1885416557_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardCryptogramPlacementStep):
        Array<ISmartCardCryptogramPlacementStep?> = (elements as
        Array<ISmartCardCryptogramPlacementStep?>).castToImpl<ISmartCardCryptogramPlacementStep,ISmartCardCryptogramPlacementStep_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardCryptogramPlacementStep?> =
        arrayOfNulls<ISmartCardCryptogramPlacementStep_Impl>(size) as
        Array<ISmartCardCryptogramPlacementStep?>
  }
}
