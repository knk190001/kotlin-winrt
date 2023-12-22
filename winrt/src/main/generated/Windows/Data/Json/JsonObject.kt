package Windows.Data.Json

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
import Windows.Foundation.Collections.IMap
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

@ABIMarker(JsonObject.ABI::class)
@Signature("rc(Windows.Data.Json.JsonObject;{064e24dd-29c2-4f83-9ac1-9ee11578beb3})")
@WinRTByReference(brClass = JsonObject.ByReference::class)
public class JsonObject(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IJsonObject.WithDefault, IJsonValue.WithDefault, IMap<String?, IJsonValue?>,
    IIterable<IKeyValuePair<String?, IJsonValue?>?>, IJsonObjectWithDefaultValues.WithDefault,
    IStringable.WithDefault, IWinRTObject {
  private val __40167919_Interface: IJsonObject.WithDefault by lazy {
    as_40167919()
  }


  private val __1531753665_Interface: IJsonValue.WithDefault by lazy {
    as_1531753665()
  }


  private val __8028824_Interface: IMap<String?, IJsonValue?> by lazy {
    as_8028824()
  }


  private val __1449643190_Interface: IIterable<IKeyValuePair<String?, IJsonValue?>?> by lazy {
    as_1449643190()
  }


  private val __1293226642_Interface: IJsonObjectWithDefaultValues.WithDefault by lazy {
    as_1293226642()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __8028824_Type: KType = typeOf<IMap<String?, IJsonValue?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<IKeyValuePair<String?,
      IJsonValue?>?>>()

  public override val __40167919_Ptr: JNAPointer? by lazy {
    __40167919_Interface.__40167919_Ptr
  }


  public override val __1531753665_Ptr: JNAPointer? by lazy {
    __1531753665_Interface.__1531753665_Ptr
  }


  public override val __8028824_Ptr: JNAPointer? by lazy {
    __8028824_Interface.__8028824_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val __1293226642_Ptr: JNAPointer? by lazy {
    __1293226642_Interface.__1293226642_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__40167919_Interface, __1531753665_Interface, __8028824_Interface,
        __1449643190_Interface, __1293226642_Interface, __328683030_Interface)

  public constructor() : this(ABI.activate())

  private fun as_40167919(): IJsonObject.WithDefault {
    if(pointer == NULL) {
      return(IJsonObject.ABI.makeIJsonObject(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IJsonObject>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IJsonObject.ABI.makeIJsonObject(ref.value))
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

  private fun as_8028824(): IMap<String?, IJsonValue?> {
    if(pointer == NULL) {
      return(IMap.ABI.makeIMap<String?, IJsonValue?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMap<String?, IJsonValue?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMap.ABI.makeIMap<String?, IJsonValue?>(ref.value))
  }

  private fun as_1449643190(): IIterable<IKeyValuePair<String?, IJsonValue?>?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<IKeyValuePair<String?, IJsonValue?>?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<IKeyValuePair<String?, IJsonValue?>?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<IKeyValuePair<String?, IJsonValue?>?>(ref.value))
  }

  private fun as_1293226642(): IJsonObjectWithDefaultValues.WithDefault {
    if(pointer == NULL) {
      return(IJsonObjectWithDefaultValues.ABI.makeIJsonObjectWithDefaultValues(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IJsonObjectWithDefaultValues>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IJsonObjectWithDefaultValues.ABI.makeIJsonObjectWithDefaultValues(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<JsonObject> {
    public override fun getValue() = JsonObject(pointer.getPointer(0))

    public fun setValue(value: JsonObject): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<JsonObject, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IJsonObjectStatics_Instance: IJsonObjectStatics by lazy {
      createIJsonObjectStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Data.Json.JsonObject".toHandle(), refiid,
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

    public fun createIJsonObjectStatics(): IJsonObjectStatics {
      val refiid = Guid.REFIID(IJsonObjectStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Data.Json.JsonObject".toHandle(),refiid,interfacePtr)
      val result = IJsonObjectStatics.ABI.makeIJsonObjectStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): JsonObject {
      val address = segment.toRawLongValue()
      return JsonObject(Pointer(address))
    }

    public override fun toNative(obj: JsonObject): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Parse(input: String) = ABI.IJsonObjectStatics_Instance.Parse(input)

    public fun TryParse(input: String, result: ByReference) =
        ABI.IJsonObjectStatics_Instance.TryParse(input, result)
  }
}
