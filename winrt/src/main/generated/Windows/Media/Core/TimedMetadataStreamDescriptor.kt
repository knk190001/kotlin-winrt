package Windows.Media.Core

import Windows.Media.Core.ITimedMetadataStreamDescriptorFactory.ABI.IID
import Windows.Media.MediaProperties.TimedMetadataEncodingProperties
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(TimedMetadataStreamDescriptor.ABI::class)
@Signature("rc(Windows.Media.Core.TimedMetadataStreamDescriptor;{133336bf-296a-463e-9ff9-01cd25691408})")
@WinRTByReference(brClass = TimedMetadataStreamDescriptor.ByReference::class)
public class TimedMetadataStreamDescriptor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITimedMetadataStreamDescriptor.WithDefault,
    IMediaStreamDescriptor2.WithDefault, IMediaStreamDescriptor.WithDefault, IWinRTObject {
  private val __1847036928_Interface: ITimedMetadataStreamDescriptor.WithDefault by lazy {
    as_1847036928()
  }


  private val __1172950892_Interface: IMediaStreamDescriptor2.WithDefault by lazy {
    as_1172950892()
  }


  private val __1209088862_Interface: IMediaStreamDescriptor.WithDefault by lazy {
    as_1209088862()
  }


  public override val __1847036928_Ptr: JNAPointer? by lazy {
    __1847036928_Interface.__1847036928_Ptr
  }


  public override val __1172950892_Ptr: JNAPointer? by lazy {
    __1172950892_Interface.__1172950892_Ptr
  }


  public override val __1209088862_Ptr: JNAPointer? by lazy {
    __1209088862_Interface.__1209088862_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1847036928_Interface, __1172950892_Interface, __1209088862_Interface)

  public constructor(encodingProperties: TimedMetadataEncodingProperties) :
      this(ABI.activate(encodingProperties))

  private fun as_1847036928(): ITimedMetadataStreamDescriptor.WithDefault {
    if(pointer == NULL) {
      return(ITimedMetadataStreamDescriptor.ABI.makeITimedMetadataStreamDescriptor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITimedMetadataStreamDescriptor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITimedMetadataStreamDescriptor.ABI.makeITimedMetadataStreamDescriptor(ref.value))
  }

  private fun as_1172950892(): IMediaStreamDescriptor2.WithDefault {
    if(pointer == NULL) {
      return(IMediaStreamDescriptor2.ABI.makeIMediaStreamDescriptor2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaStreamDescriptor2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaStreamDescriptor2.ABI.makeIMediaStreamDescriptor2(ref.value))
  }

  private fun as_1209088862(): IMediaStreamDescriptor.WithDefault {
    if(pointer == NULL) {
      return(IMediaStreamDescriptor.ABI.makeIMediaStreamDescriptor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaStreamDescriptor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaStreamDescriptor.ABI.makeIMediaStreamDescriptor(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TimedMetadataStreamDescriptor> {
    public override fun getValue() = TimedMetadataStreamDescriptor(pointer.getPointer(0))

    public fun setValue(value: TimedMetadataStreamDescriptor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TimedMetadataStreamDescriptor, MemoryAddress> {
    public val ITimedMetadataStreamDescriptorFactory_Instance: ITimedMetadataStreamDescriptorFactory
        by lazy {
      createITimedMetadataStreamDescriptorFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITimedMetadataStreamDescriptorFactory():
        ITimedMetadataStreamDescriptorFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Core.TimedMetadataStreamDescriptor".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITimedMetadataStreamDescriptorFactory.ABI.makeITimedMetadataStreamDescriptorFactory(factoryActivatorPtr.value))
    }

    public fun activate(encodingProperties: TimedMetadataEncodingProperties): JNAPointer? =
        ITimedMetadataStreamDescriptorFactory_Instance.Create(encodingProperties)?.pointer

    public override fun fromNative(segment: MemoryAddress): TimedMetadataStreamDescriptor {
      val address = segment.toRawLongValue()
      return TimedMetadataStreamDescriptor(Pointer(address))
    }

    public override fun toNative(obj: TimedMetadataStreamDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
