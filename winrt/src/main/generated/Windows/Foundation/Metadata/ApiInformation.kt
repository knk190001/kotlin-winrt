package Windows.Foundation.Metadata

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ApiInformation.ABI::class)
@WinRTByReference(brClass = ApiInformation.ByReference::class)
public class ApiInformation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ApiInformation>
      {
    public override fun getValue() = ApiInformation(pointer.getPointer(0))

    public fun setValue(value: ApiInformation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ApiInformation, MemoryAddress> {
    public val IApiInformationStatics_Instance: IApiInformationStatics by lazy {
      createIApiInformationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIApiInformationStatics(): IApiInformationStatics {
      val refiid = Guid.REFIID(IApiInformationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Foundation.Metadata.ApiInformation".toHandle(),refiid,interfacePtr)
      val result = IApiInformationStatics.ABI.makeIApiInformationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ApiInformation {
      val address = segment.toRawLongValue()
      return ApiInformation(Pointer(address))
    }

    public override fun toNative(obj: ApiInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun IsTypePresent(typeName: String) =
        ABI.IApiInformationStatics_Instance.IsTypePresent(typeName)

    public fun IsMethodPresent(typeName: String, methodName: String) =
        ABI.IApiInformationStatics_Instance.IsMethodPresent(typeName, methodName)

    public fun IsMethodPresent(
      typeName: String,
      methodName: String,
      inputParameterCount: WinDef.UINT
    ) = ABI.IApiInformationStatics_Instance.IsMethodPresent(typeName, methodName,
        inputParameterCount)

    public fun IsEventPresent(typeName: String, eventName: String) =
        ABI.IApiInformationStatics_Instance.IsEventPresent(typeName, eventName)

    public fun IsPropertyPresent(typeName: String, propertyName: String) =
        ABI.IApiInformationStatics_Instance.IsPropertyPresent(typeName, propertyName)

    public fun IsReadOnlyPropertyPresent(typeName: String, propertyName: String) =
        ABI.IApiInformationStatics_Instance.IsReadOnlyPropertyPresent(typeName, propertyName)

    public fun IsWriteablePropertyPresent(typeName: String, propertyName: String) =
        ABI.IApiInformationStatics_Instance.IsWriteablePropertyPresent(typeName, propertyName)

    public fun IsEnumNamedValuePresent(enumTypeName: String, valueName: String) =
        ABI.IApiInformationStatics_Instance.IsEnumNamedValuePresent(enumTypeName, valueName)

    public fun IsApiContractPresent(contractName: String, majorVersion: WinDef.USHORT) =
        ABI.IApiInformationStatics_Instance.IsApiContractPresent(contractName, majorVersion)

    public fun IsApiContractPresent(
      contractName: String,
      majorVersion: WinDef.USHORT,
      minorVersion: WinDef.USHORT
    ) = ABI.IApiInformationStatics_Instance.IsApiContractPresent(contractName, majorVersion,
        minorVersion)
  }
}
