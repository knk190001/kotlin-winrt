package Windows.Media.MediaProperties

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
import kotlin.Byte
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(TimedMetadataEncodingProperties.ABI::class)
@Signature("rc(Windows.Media.MediaProperties.TimedMetadataEncodingProperties;{51cd30d3-d690-4cfa-97f4-4a398e9db420})")
@WinRTByReference(brClass = TimedMetadataEncodingProperties.ByReference::class)
public class TimedMetadataEncodingProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITimedMetadataEncodingProperties.WithDefault,
    IMediaEncodingProperties.WithDefault, IWinRTObject {
  private val __59979813_Interface: ITimedMetadataEncodingProperties.WithDefault by lazy {
    as_59979813()
  }


  private val __1294923267_Interface: IMediaEncodingProperties.WithDefault by lazy {
    as_1294923267()
  }


  public override val __59979813_Ptr: JNAPointer? by lazy {
    __59979813_Interface.__59979813_Ptr
  }


  public override val __1294923267_Ptr: JNAPointer? by lazy {
    __1294923267_Interface.__1294923267_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__59979813_Interface, __1294923267_Interface)

  public constructor() : this(ABI.activate())

  private fun as_59979813(): ITimedMetadataEncodingProperties.WithDefault {
    if(pointer == NULL) {
      return(ITimedMetadataEncodingProperties.ABI.makeITimedMetadataEncodingProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITimedMetadataEncodingProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITimedMetadataEncodingProperties.ABI.makeITimedMetadataEncodingProperties(ref.value))
  }

  private fun as_1294923267(): IMediaEncodingProperties.WithDefault {
    if(pointer == NULL) {
      return(IMediaEncodingProperties.ABI.makeIMediaEncodingProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaEncodingProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaEncodingProperties.ABI.makeIMediaEncodingProperties(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TimedMetadataEncodingProperties> {
    public override fun getValue() = TimedMetadataEncodingProperties(pointer.getPointer(0))

    public fun setValue(value: TimedMetadataEncodingProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TimedMetadataEncodingProperties, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ITimedMetadataEncodingPropertiesStatics_Instance:
        ITimedMetadataEncodingPropertiesStatics by lazy {
      createITimedMetadataEncodingPropertiesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.MediaProperties.TimedMetadataEncodingProperties".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createITimedMetadataEncodingPropertiesStatics():
        ITimedMetadataEncodingPropertiesStatics {
      val refiid = Guid.REFIID(ITimedMetadataEncodingPropertiesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.MediaProperties.TimedMetadataEncodingProperties".toHandle(),refiid,interfacePtr)
      val result =
          ITimedMetadataEncodingPropertiesStatics.ABI.makeITimedMetadataEncodingPropertiesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): TimedMetadataEncodingProperties {
      val address = segment.toRawLongValue()
      return TimedMetadataEncodingProperties(Pointer(address))
    }

    public override fun toNative(obj: TimedMetadataEncodingProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreatePgs() = ABI.ITimedMetadataEncodingPropertiesStatics_Instance.CreatePgs()

    public fun CreateSrt() = ABI.ITimedMetadataEncodingPropertiesStatics_Instance.CreateSrt()

    public fun CreateSsa(formatUserData: Array<Byte>) =
        ABI.ITimedMetadataEncodingPropertiesStatics_Instance.CreateSsa(formatUserData)

    public fun CreateVobSub(formatUserData: Array<Byte>) =
        ABI.ITimedMetadataEncodingPropertiesStatics_Instance.CreateVobSub(formatUserData)
  }
}
