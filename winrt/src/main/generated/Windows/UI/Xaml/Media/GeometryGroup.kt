package Windows.UI.Xaml.Media

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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(GeometryGroup.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.GeometryGroup;{55225a61-8677-4c8c-8e46-ee3dc355114b})")
@WinRTByReference(brClass = GeometryGroup.ByReference::class)
public class GeometryGroup(
  ptr: JNAPointer? = NULL
) : Geometry(ptr), IGeometryGroup.WithDefault, IWinRTObject {
  private val __1572109489_Interface: IGeometryGroup.WithDefault by lazy {
    as_1572109489()
  }


  public override val __1572109489_Ptr: JNAPointer? by lazy {
    __1572109489_Interface.__1572109489_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1572109489_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1572109489(): IGeometryGroup.WithDefault {
    if(pointer == NULL) {
      return(IGeometryGroup.ABI.makeIGeometryGroup(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGeometryGroup>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGeometryGroup.ABI.makeIGeometryGroup(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<GeometryGroup>
      {
    public override fun getValue() = GeometryGroup(pointer.getPointer(0))

    public fun setValue(value: GeometryGroup): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GeometryGroup, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IGeometryGroupStatics_Instance: IGeometryGroupStatics by lazy {
      createIGeometryGroupStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.GeometryGroup".toHandle(),
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

    public fun createIGeometryGroupStatics(): IGeometryGroupStatics {
      val refiid = Guid.REFIID(IGeometryGroupStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.GeometryGroup".toHandle(),refiid,interfacePtr)
      val result = IGeometryGroupStatics.ABI.makeIGeometryGroupStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GeometryGroup {
      val address = segment.toRawLongValue()
      return GeometryGroup(Pointer(address))
    }

    public override fun toNative(obj: GeometryGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_FillRuleProperty() = ABI.IGeometryGroupStatics_Instance.get_FillRuleProperty()

    public fun get_ChildrenProperty() = ABI.IGeometryGroupStatics_Instance.get_ChildrenProperty()
  }
}
