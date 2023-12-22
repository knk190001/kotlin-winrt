package Windows.Data.Json

import Windows.Foundation.IStringable
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Boolean
import kotlin.Double
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(JsonValue.ABI::class)
@Signature("rc(Windows.Data.Json.JsonValue;{a3219ecb-f0b3-4dcd-beee-19d48cd3ed1e})")
@WinRTByReference(brClass = JsonValue.ByReference::class)
public class JsonValue(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IJsonValue.WithDefault, IStringable.WithDefault, IWinRTObject {
  private val __1531753665_Interface: IJsonValue.WithDefault by lazy {
    as_1531753665()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __1531753665_Ptr: JNAPointer? by lazy {
    __1531753665_Interface.__1531753665_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1531753665_Interface, __328683030_Interface)

  private fun as_1531753665(): IJsonValue.WithDefault {
    if(pointer == NULL) {
      return(IJsonValue.ABI.makeIJsonValue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IJsonValue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IJsonValue.ABI.makeIJsonValue(ref.value))
  }

  private fun as_328683030(): IStringable.WithDefault {
    if(pointer == NULL) {
      return(IStringable.ABI.makeIStringable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStringable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStringable.ABI.makeIStringable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<JsonValue> {
    public override fun getValue() = JsonValue(pointer.getPointer(0))

    public fun setValue(value: JsonValue): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<JsonValue, MemoryAddress> {
    public val IJsonValueStatics_Instance: IJsonValueStatics by lazy {
      createIJsonValueStatics()
    }


    public val IJsonValueStatics2_Instance: IJsonValueStatics2 by lazy {
      createIJsonValueStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIJsonValueStatics(): IJsonValueStatics {
      val refiid = Guid.REFIID(IJsonValueStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Data.Json.JsonValue".toHandle(),refiid,interfacePtr)
      val result = IJsonValueStatics.ABI.makeIJsonValueStatics(interfacePtr.value)
      return result
    }

    public fun createIJsonValueStatics2(): IJsonValueStatics2 {
      val refiid = Guid.REFIID(IJsonValueStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Data.Json.JsonValue".toHandle(),refiid,interfacePtr)
      val result = IJsonValueStatics2.ABI.makeIJsonValueStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): JsonValue {
      val address = segment.toRawLongValue()
      return JsonValue(Pointer(address))
    }

    public override fun toNative(obj: JsonValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Parse(input: String) = ABI.IJsonValueStatics_Instance.Parse(input)

    public fun TryParse(input: String, result: ByReference) =
        ABI.IJsonValueStatics_Instance.TryParse(input, result)

    public fun CreateBooleanValue(input: Boolean) =
        ABI.IJsonValueStatics_Instance.CreateBooleanValue(input)

    public fun CreateNumberValue(input: Double) =
        ABI.IJsonValueStatics_Instance.CreateNumberValue(input)

    public fun CreateStringValue(input: String) =
        ABI.IJsonValueStatics_Instance.CreateStringValue(input)

    public fun CreateNullValue() = ABI.IJsonValueStatics2_Instance.CreateNullValue()
  }
}
