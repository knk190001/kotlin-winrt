package Windows.Data.Json

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVector
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
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(JsonArray.ABI::class)
@Signature("rc(Windows.Data.Json.JsonArray;{08c1ddb6-0cbd-4a9a-b5d3-2f852dc37e81})")
@WinRTByReference(brClass = JsonArray.ByReference::class)
public class JsonArray(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IJsonArray.WithDefault, IJsonValue.WithDefault, IVector<IJsonValue?>,
    IIterable<IJsonValue?>, IStringable.WithDefault, IWinRTObject {
  private val __1512871337_Interface: IJsonArray.WithDefault by lazy {
    as_1512871337()
  }


  private val __1531753665_Interface: IJsonValue.WithDefault by lazy {
    as_1531753665()
  }


  private val __1070388601_Interface: IVector<IJsonValue?> by lazy {
    as_1070388601()
  }


  private val __1449643190_Interface: IIterable<IJsonValue?> by lazy {
    as_1449643190()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __1070388601_Type: KType = typeOf<IVector<IJsonValue?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<IJsonValue?>>()

  public override val __1512871337_Ptr: JNAPointer? by lazy {
    __1512871337_Interface.__1512871337_Ptr
  }


  public override val __1531753665_Ptr: JNAPointer? by lazy {
    __1531753665_Interface.__1531753665_Ptr
  }


  public override val __1070388601_Ptr: JNAPointer? by lazy {
    __1070388601_Interface.__1070388601_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1512871337_Interface, __1531753665_Interface, __1070388601_Interface,
        __1449643190_Interface, __328683030_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1512871337(): IJsonArray.WithDefault {
    if(pointer == NULL) {
      return(IJsonArray.ABI.makeIJsonArray(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IJsonArray>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IJsonArray.ABI.makeIJsonArray(ref.value))
  }

  private fun as_1531753665(): IJsonValue.WithDefault {
    if(pointer == NULL) {
      return(IJsonValue.ABI.makeIJsonValue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IJsonValue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IJsonValue.ABI.makeIJsonValue(ref.value))
  }

  private fun as_1070388601(): IVector<IJsonValue?> {
    if(pointer == NULL) {
      return(IVector.ABI.makeIVector<IJsonValue?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVector<IJsonValue?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVector.ABI.makeIVector<IJsonValue?>(ref.value))
  }

  private fun as_1449643190(): IIterable<IJsonValue?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<IJsonValue?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<IJsonValue?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<IJsonValue?>(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<JsonArray> {
    public override fun getValue() = JsonArray(pointer.getPointer(0))

    public fun setValue(value: JsonArray): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<JsonArray, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IJsonArrayStatics_Instance: IJsonArrayStatics by lazy {
      createIJsonArrayStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Data.Json.JsonArray".toHandle(), refiid,
          iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIJsonArrayStatics(): IJsonArrayStatics {
      val refiid = Guid.REFIID(IJsonArrayStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Data.Json.JsonArray".toHandle(),refiid,interfacePtr)
      val result = IJsonArrayStatics.ABI.makeIJsonArrayStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): JsonArray {
      val address = segment.toRawLongValue()
      return JsonArray(Pointer(address))
    }

    public override fun toNative(obj: JsonArray): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Parse(input: String) = ABI.IJsonArrayStatics_Instance.Parse(input)

    public fun TryParse(input: String, result: ByReference) =
        ABI.IJsonArrayStatics_Instance.TryParse(input, result)
  }
}
